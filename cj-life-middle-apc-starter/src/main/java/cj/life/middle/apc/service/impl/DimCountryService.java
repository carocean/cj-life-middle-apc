package cj.life.middle.apc.service.impl;

import cj.life.ability.api.exception.ApiException;
import cj.life.middle.apc.domain.DimCountry;
import cj.life.middle.apc.domain.DimCountryExample;
import cj.life.middle.apc.repository.mapper.DimCountryMapper;
import cj.life.middle.apc.service.IDimCountryService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DimCountryService implements IDimCountryService {
    @Resource
    DimCountryMapper countryMapper;

    @Override
    public String createCountry(String cnName, String enName, String alpha2Code, String alpha3Code, String numericCode, String areaCode) {
        if (existsCountryCnName(cnName)) {
            throw new ApiException("5000", "The chinese name of country type already exists.");
        }
        String idNumSeq = null;
        while (true) {
            idNumSeq = RandomStringUtils.randomNumeric(11);
            DimCountryExample example = new DimCountryExample();
            example.createCriteria().andCountryIdEqualTo(idNumSeq);
            long count = countryMapper.countByExample(example);
            if (count < 1) {
                break;
            }
        }
        DimCountry country = new DimCountry();
        country.setCountryId(idNumSeq);
        country.setAlpha2Code(alpha2Code);
        country.setAlpha3Code(alpha3Code);
        country.setAreaCode(areaCode);
        country.setCnName(cnName);
        country.setEnName(enName);
        country.setNumericCode(numericCode);
        countryMapper.insertSelective(country);
        return idNumSeq;
    }

    private boolean existsCountryCnName(String cnName) {
        DimCountryExample example = new DimCountryExample();
        example.createCriteria().andCnNameEqualTo(cnName);
        return countryMapper.countByExample(example) > 0;
    }

    @Override
    public void removeCountry(String countryId) {
        countryMapper.deleteByPrimaryKey(countryId);
    }

    @Override
    public List<DimCountry> listCountry() {
        DimCountryExample example = new DimCountryExample();
        example.createCriteria();
        example.setOrderByClause("en_name asc, cn_name asc");
        return countryMapper.selectByExample(example);
    }

    @Override
    public List<DimCountry> likeCountryByCnName(String cnName) {
        DimCountryExample example = new DimCountryExample();
        example.createCriteria().andCnNameLike("%" + cnName + "%");
        return countryMapper.selectByExample(example);
    }

    @Override
    public List<DimCountry> likeCountryByEnName(String enName) {
        DimCountryExample example = new DimCountryExample();
        example.createCriteria().andEnNameLike("%" + enName + "%");
        return countryMapper.selectByExample(example);
    }

    @Override
    public List<DimCountry> likeCountryByAreaCode(String areaCode) {
        DimCountryExample example = new DimCountryExample();
        example.createCriteria().andAreaCodeLike("%" + areaCode + "%");
        return countryMapper.selectByExample(example);
    }
}
