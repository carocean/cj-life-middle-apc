package cj.life.middle.apc.service.impl;

import cj.life.middle.apc.remote.UcAppRemote;
import cj.life.middle.apc.domain.*;
import cj.life.middle.apc.repository.mapper.FactAppMapper;
import cj.life.middle.apc.repository.mapper.FactImgsMapper;
import cj.life.middle.apc.repository.mapper.FactVersionsMapper;
import cj.life.middle.apc.repository.mapper.MtPortletAppMapper;
import cj.life.middle.apc.service.IFactAppService;
import cj.life.middle.apc.util.IDateUtil;
import cj.life.middle.uc.domain.UcApp;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

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

    @Override
    public void createFactApp(String appId, String dimCateId, String dimTerminalId, String dimCountryId, String dimChargeMode, BigDecimal emplUnitPrice, BigDecimal tenantUnitPrice, String note) {
        UcApp app = ucAppRemote.getApp(appId);
        System.out.println(app);
        List<UcApp> list = ucAppRemote.listApp(10, 0);
        System.out.println(list);
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
        return null;
    }

    @Override
    public List<FactApp> listFactAppWithDim(String dimCateId, String dimTerminalId, String dimCountryId, String dimChargeMode, int limit, long offset) {
        return null;
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
        return null;
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
        return null;
    }
}
