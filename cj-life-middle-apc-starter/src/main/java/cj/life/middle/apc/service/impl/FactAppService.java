package cj.life.middle.apc.service.impl;

import cj.life.ability.api.ResultCode;
import cj.life.ability.api.exception.ApiException;
import cj.life.middle.apc.domain.*;
import cj.life.middle.apc.remote.*;
import cj.life.middle.apc.repository.mapper.*;
import cj.life.middle.apc.service.IFactAppService;
import cj.life.middle.apc.util.IDateUtil;
import cj.life.middle.uc.domain.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class FactAppService implements IFactAppService {
    @Resource
    FactAppMapper appMapper;
    @Resource
    FactImgsMapper imgsMapper;
    @Resource
    FactVersionsMapper versionsMapper;
    @Resource
    MtPortletAppMapper portletAppMapper;
    @Resource
    UcAppRemote ucAppRemote;
    @Resource
    EmployeeRemote employeeRemote;
    @Resource
    UcUserRemote ucUserRemote;
    @Resource
    UcTenantRemote tenantRemote;
    @Resource
    OrgRemote orgRemote;
    @Resource
    DimCategoryMapper categoryMapper;
    @Resource
    DimCountryMapper countryMapper;
    @Resource
    DimTerminalMapper terminalMapper;

    @Transactional
    @Override
    public void releaseFactApp(String appId, String appSlogan, String appVersion, String dimCateId, String dimTerminalId, String dimCountryId, String dimChargeMode, BigDecimal emplUnitPrice, BigDecimal tenantUnitPrice, String note) {
        UcApp ucApp = ucAppRemote.getApp(appId);
        if (ucApp == null) {
            throw new ApiException(ResultCode.NOTFOUND_ERROR);
        }
        DimCategory category = categoryMapper.selectByPrimaryKey(dimCateId);
        if (category == null) {
            throw new ApiException(ResultCode.NOTFOUND_ERROR);
        }
        DimCountry country = countryMapper.selectByPrimaryKey(dimCountryId);
        if (country == null) {
            throw new ApiException(ResultCode.NOTFOUND_ERROR);
        }
        DimTerminal terminal = terminalMapper.selectByPrimaryKey(dimTerminalId);
        if (terminal == null) {
            throw new ApiException(ResultCode.NOTFOUND_ERROR);
        }
        FactApp factApp = new FactApp();
        factApp.setAppId(appId);
        factApp.setCateId(dimCateId);
        factApp.setCateName(category.getCateName());
        factApp.setTerminalId(dimTerminalId);
        factApp.setTerminalName(terminal.getTerminalName());
        factApp.setCountryId(dimCountryId);
        factApp.setCountryName(country.getCnName());
        factApp.setChargeMode(dimChargeMode);
        factApp.setChargeName("free".equals(dimChargeMode) ? "免费" : "付费");
        factApp.setEmplUnitPrice(emplUnitPrice);
        factApp.setTenantUnitPrice(tenantUnitPrice);
        TenantEmpl empl = employeeRemote.getEmployee(ucApp.getCreator());
        if (empl == null) {
            throw new ApiException(ResultCode.NOTFOUND_ERROR);
        }
        UcUser user = ucUserRemote.getUser(empl.getUserId());
        if (user == null) {
            throw new ApiException(ResultCode.NOTFOUND_ERROR);
        }
        factApp.setAppDeveloper(StringUtils.hasText(empl.getAlias()) ? empl.getAlias() : user.getUserName());
        UcTenant tenant = tenantRemote.getTenant(empl.getTenantId());
        if (tenant == null) {
            throw new ApiException(ResultCode.NOTFOUND_ERROR);
        }
        factApp.setAppTenant(tenant.getTenantName());
        UcOrg org = orgRemote.getOrgByTenant(tenant.getTenantId());
        if (org == null) {
            throw new ApiException(ResultCode.NOTFOUND_ERROR);
        }
        factApp.setAppSupplier(org.getOrgName());
        factApp.setAppIcon(ucApp.getAppIcon());
        factApp.setAppName(ucApp.getAppName());
        factApp.setAppNote(note);
        factApp.setAppSlogan(appSlogan);
        factApp.setPubTime(IDateUtil.toDateEndMicoSecond(System.currentTimeMillis()));
        factApp.setNewestVersion(appVersion);

        appMapper.insertSelective(factApp);

        FactVersions versions = new FactVersions();
        String idNumSeq = null;
        while (true) {
            idNumSeq = RandomStringUtils.randomNumeric(20);
            FactVersionsExample example = new FactVersionsExample();
            example.createCriteria().andVersionIdEqualTo(idNumSeq);
            long count = versionsMapper.countByExample(example);
            if (count < 1) {
                break;
            }
        }
        versions.setVersionId(idNumSeq);
        versions.setAppId(appId);
        versions.setPubTime(IDateUtil.toDateEndMicoSecond(System.currentTimeMillis()));
        versions.setVersionNum(appVersion);
        versions.setVersionNote(note);
        versionsMapper.insertSelective(versions);
    }

    @Override
    public void removeFactApp(String appId) {
        appMapper.deleteByPrimaryKey(appId);
    }

    @Override
    public FactApp getFactApp(String appId) {
        return appMapper.selectByPrimaryKey(appId);
    }

    @Override
    public List<FactApp> listFactApp(int limit, long offset) {
        return appMapper.listFactApp(limit, offset);
    }

    @Override
    public List<FactApp> listFactAppWithDim(String dimCateId, String dimTerminalId, String dimCountryId, String dimChargeMode, int limit, long offset) {
        return appMapper.listFactAppWithDim(dimCateId, dimTerminalId, dimCountryId, dimChargeMode, limit, offset);
    }

    @Override
    public void upToPortlet(String appId, String portletId, int orderNum) {
        MtPortletApp mtPortletApp = new MtPortletApp();
        mtPortletApp.setPortletId(portletId);
        mtPortletApp.setAppId(appId);
        mtPortletApp.setOrderNum(orderNum);
        portletAppMapper.insertSelective(mtPortletApp);
    }

    @Override
    public void downFromPortlet(String appId, String portletId) {
        portletAppMapper.deleteByPrimaryKey(portletId, appId);
    }

    @Override
    public List<FactApp> listFactAppWithPortlet(String portletId, int limit, long offset) {
        return portletAppMapper.listAppByPortlet(portletId, limit, offset);
    }

    @Override
    public void addImage(String appId, String imgSrc, String imgNote) {
        String idNumSeq = null;
        while (true) {
            idNumSeq = RandomStringUtils.randomNumeric(20);
            FactImgsExample example = new FactImgsExample();
            example.createCriteria().andImgIdEqualTo(idNumSeq);
            long count = imgsMapper.countByExample(example);
            if (count < 1) {
                break;
            }
        }
        FactImgs imgs = new FactImgs();
        imgs.setImgId(idNumSeq);
        imgs.setAppId(appId);
        imgs.setImgSrc(imgSrc);
        imgs.setImgNote(imgNote);
        imgs.setCreateTime(IDateUtil.toDateEndMicoSecond(System.currentTimeMillis()));
        imgsMapper.insertSelective(imgs);
    }

    @Override
    public void removeImage(String imgId) {
        imgsMapper.deleteByPrimaryKey(imgId);
    }

    @Override
    public List<FactImgs> listImage(String appId) {
        FactImgsExample example = new FactImgsExample();
        example.createCriteria().andAppIdEqualTo(appId);
        return imgsMapper.selectByExample(example);
    }

    @Override
    public List<FactVersions> listVersion(String appId, int limit, long offset) {
        return versionsMapper.listVersion(appId, limit, offset);
    }
}
