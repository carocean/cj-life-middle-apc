package cj.life.middle.apc.web;

import cj.life.middle.apc.domain.DimCountry;

import java.util.List;

public interface IDimCountryRC {
    String createCountry(String cnName, String enName, String alpha2Code, String alpha3Code, String numericCode, String areaCode);

    void removeCountry(String countryId);

    List<DimCountry> listCountry();

    List<DimCountry> likeCountryByCnName(String cnName);

    List<DimCountry> likeCountryByEnName(String enName);
    List<DimCountry> likeCountryByAreaCode(String areaCode);
}
