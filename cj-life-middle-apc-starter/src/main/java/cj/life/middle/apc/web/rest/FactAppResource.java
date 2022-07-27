package cj.life.middle.apc.web.rest;

import cj.life.ability.api.ResultCode;
import cj.life.ability.api.annotation.ApiResult;
import cj.life.ability.api.exception.ApiException;
import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.domain.FactImgs;
import cj.life.middle.apc.domain.FactVersions;
import cj.life.middle.apc.service.IFactAppService;
import cj.life.middle.apc.web.IFactAppRC;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/fact/app")
@Api(tags = {"应用管理"})
@Slf4j
public class FactAppResource implements IFactAppRC {
    @Autowired
    IFactAppService factAppService;

    @GetMapping("/createFactApp")
    @ApiOperation("创建应用")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void createFactApp(
            @RequestParam String appId,
            @RequestParam String dimCateId,
            @RequestParam String dimTerminalId,
            @RequestParam String dimCountryId,
            @RequestParam String dimChargeMode,
            @RequestParam BigDecimal emplUnitPrice,
            @RequestParam BigDecimal tenantUnitPrice,
            @ApiParam String note) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(dimCateId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(dimTerminalId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(dimCountryId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(dimChargeMode)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (emplUnitPrice == null) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (tenantUnitPrice == null) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        factAppService.createFactApp(appId, dimCateId, dimTerminalId, dimCountryId, dimChargeMode, emplUnitPrice, tenantUnitPrice, note);
    }

    @GetMapping("/removeFactApp")
    @ApiOperation("移除应用")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void removeFactApp(@RequestParam String appId) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        factAppService.removeFactApp(appId);
    }

    @GetMapping("/getFactApp")
    @ApiOperation("获取应用")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public FactApp getFactApp(@RequestParam String appId) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return factAppService.getFactApp(appId);
    }

    @GetMapping("/listFactApp")
    @ApiOperation("列出应用")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public List<FactApp> listFactApp(@RequestParam int limit, @RequestParam long offset) {
        return factAppService.listFactApp(limit, offset);
    }

    @GetMapping("/listFactAppWithDim")
    @ApiOperation("列出应用【按维度】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public List<FactApp> listFactAppWithDim(
            @ApiParam String dimCateId,
            @ApiParam String dimTerminalId,
            @ApiParam String dimCountryId,
            @ApiParam String dimChargeMode,
            @RequestParam int limit,
            @RequestParam long offset) {
        return factAppService.listFactAppWithDim(dimCateId, dimTerminalId, dimCountryId, dimChargeMode, limit, offset);
    }

    @GetMapping("/upToPortlet")
    @ApiOperation("应用上栏")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void upToPortlet(@RequestParam String appId, @RequestParam String portletId, @RequestParam int orderNum) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        factAppService.upToPortlet(appId, portletId, orderNum);
    }

    @GetMapping("/downFromPortlet")
    @ApiOperation("应用下栏")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void downFromPortlet(@RequestParam String appId, @RequestParam String portletId) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        factAppService.downFromPortlet(appId, portletId);
    }

    @GetMapping("/listFactAppWithPortlet")
    @ApiOperation("列出应用【按栏目】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public List<FactApp> listFactAppWithPortlet(@RequestParam String portletId, @RequestParam int limit, @RequestParam long offset) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return factAppService.listFactAppWithPortlet(portletId, limit, offset);
    }

    @GetMapping("/addImage")
    @ApiOperation("添加应用图片")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void addImage(@RequestParam String appId, @RequestParam String imgSrc, @ApiParam String imgNote) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(imgSrc)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        factAppService.addImage(appId, imgSrc, imgNote);
    }

    @GetMapping("/removeImage")
    @ApiOperation("移除应用图片")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void removeImage(String imgId) {
        if (!StringUtils.hasText(imgId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        factAppService.removeImage(imgId);
    }

    @GetMapping("/listImage")
    @ApiOperation("列出应用图片")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public List<FactImgs> listImage(String appId) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return factAppService.listImage(appId);
    }

    @GetMapping("/listVersion")
    @ApiOperation("列出应用历史版本")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public List<FactVersions> listVersion(@RequestParam String appId, @RequestParam int limit, @RequestParam long offset) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return factAppService.listVersion(appId, limit, offset);
    }
}
