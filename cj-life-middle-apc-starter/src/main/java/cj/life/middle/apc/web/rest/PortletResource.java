package cj.life.middle.apc.web.rest;

import cj.life.ability.api.ResultCode;
import cj.life.ability.api.annotation.ApiResult;
import cj.life.ability.api.exception.ApiException;
import cj.life.ability.mybatis.config.DataSourceConfig;
import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.service.IPortletService;
import cj.life.middle.apc.web.IPortletRC;
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

import java.util.List;

@RestController
@RequestMapping("/api/v1/portlet")
@Api(tags = {"栏目管理"})
@Slf4j
public class PortletResource implements IPortletRC {
    @Autowired
    IPortletService portletService;

    @GetMapping("/createPortlet")
    @ApiOperation("创建栏目")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public String createPortlet(@RequestParam String portletName, @ApiParam String showMode, @ApiParam String portletNote) {
        if (!StringUtils.hasText(portletName)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(showMode)) {
            showMode = enumShowModes().get(0);
        }
        return portletService.createPortlet(portletName, showMode, portletNote);
    }

    @GetMapping("/enumShowModes")
    @ApiOperation("枚举栏目支持的显示模式")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<String> enumShowModes() {
        return portletService.enumShowModes();
    }

    @GetMapping("/removePortlet")
    @ApiOperation("移除栏目")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void removePortlet(@RequestParam String portletId) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        portletService.removePortlet(portletId);
    }

    @GetMapping("/setShowMode")
    @ApiOperation("设置栏目显示模式")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void setShowMode(@RequestParam String portletId, @RequestParam String showMode) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(showMode)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        boolean found = false;
        for (String mode : enumShowModes()) {
            if (mode.equals(showMode)) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ApiException(ResultCode.PARAM_IS_INVALID);
        }
        portletService.setShowMode(portletId, showMode);
    }

    @GetMapping("/listPortlet")
    @ApiOperation("列出栏目")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<ApcPortlet> listPortlet(@RequestParam int limit, @RequestParam long offset) {
        return portletService.listPortlet(limit, offset);
    }

    @GetMapping("/listPortletByShowMode")
    @ApiOperation("列出栏目【通过显示模式】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<ApcPortlet> listPortletByShowMode(@RequestParam String showMode, @RequestParam int limit, @RequestParam long offset) {
        if (!StringUtils.hasText(showMode)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return portletService.listPortletByShowMode(showMode, limit, offset);
    }

    @GetMapping("/mountAppToPortlet")
    @ApiOperation("挂载app到栏目")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void mountAppToPortlet(@RequestParam String appId, @RequestParam String portletId, @RequestParam int orderNum) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        portletService.mountAppToPortlet(appId, portletId, orderNum);
    }

    @GetMapping("/unmountAppToPortlet")
    @ApiOperation("卸载app自栏目")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void unmountAppToPortlet(@RequestParam String appId, @RequestParam String portletId) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        portletService.unmountAppToPortlet(appId, portletId);
    }

    @GetMapping("/listAppByPortlet")
    @ApiOperation("列出栏目中的应用")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<FactApp> listAppByPortlet(@RequestParam String portletId, @RequestParam int limit, @RequestParam long offset) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return portletService.listAppByPortlet(portletId, limit, offset);
    }

    @GetMapping("/listPortletByApp")
    @ApiOperation("列出应用所在的所有栏目")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<ApcPortlet> listPortletByApp(String appId) {
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return portletService.listPortletByApp(appId);
    }
}
