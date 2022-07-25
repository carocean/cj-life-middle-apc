package cj.life.middle.apc.web.rest;

import cj.life.ability.api.ResultCode;
import cj.life.ability.api.annotation.ApiResult;
import cj.life.ability.api.exception.ApiException;
import cj.life.ability.mybatis.config.DataSourceConfig;
import cj.life.middle.apc.domain.DimCountry;
import cj.life.middle.apc.service.IDimCountryService;
import cj.life.middle.apc.web.IDimCountryRC;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dim/country")
@Api(tags = {"维度:国家管理"})
@Slf4j
public class DimCountryResource implements IDimCountryRC {
    @Autowired
    IDimCountryService dimCountryService;

    @GetMapping("/createCountry")
    @ApiOperation("创建国家")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public String createCountry(
            @RequestParam String cnName,
            @RequestParam String enName,
            @RequestParam String alpha2Code,
            @RequestParam String alpha3Code,
            @RequestParam String numericCode,
            @RequestParam String areaCode) {
        if (!StringUtils.hasText(cnName)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(enName)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(alpha2Code)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(alpha3Code)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(numericCode)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(areaCode)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return dimCountryService.createCountry(cnName, enName, alpha2Code, alpha3Code, numericCode, areaCode);
    }
    @GetMapping("/removeCountry")
    @ApiOperation("移除国家")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void removeCountry(@RequestParam String countryId) {
        if (!StringUtils.hasText(countryId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        dimCountryService.removeCountry(countryId);
    }
    @GetMapping("/listCountry")
    @ApiOperation("列出国家")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<DimCountry> listCountry() {
        return dimCountryService.listCountry();
    }
    @GetMapping("/likeCountryByCnName")
    @ApiOperation("查询国家【按国家中文名模糊查询】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<DimCountry> likeCountryByCnName(@RequestParam String cnName) {
        if (!StringUtils.hasText(cnName)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return dimCountryService.likeCountryByCnName(cnName);
    }
    @GetMapping("/likeCountryByEnName")
    @ApiOperation("查询国家【按国家英文名模糊查询】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<DimCountry> likeCountryByEnName(@RequestParam String enName) {
        if (!StringUtils.hasText(enName)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return dimCountryService.likeCountryByEnName(enName);
    }
    @GetMapping("/likeCountryByAreaCode")
    @ApiOperation("查询国家【按国家区域代码模糊查询】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<DimCountry> likeCountryByAreaCode(@RequestParam String areaCode) {
        if (!StringUtils.hasText(areaCode)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return dimCountryService.likeCountryByAreaCode(areaCode);
    }
}
