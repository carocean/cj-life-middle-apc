package cj.life.middle.apc.web.rest;

import cj.life.ability.api.ResultCode;
import cj.life.ability.api.annotation.ApiResult;
import cj.life.ability.api.exception.ApiException;
import cj.life.ability.mybatis.config.DataSourceConfig;
import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.DimCategory;
import cj.life.middle.apc.service.IDimCategoryService;
import cj.life.middle.apc.web.IDimCategoryRC;
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
@RequestMapping("/api/v1/dim/category")
@Api(tags = {"维度:类别管理"})
@Slf4j
public class DimCategoryResource implements IDimCategoryRC {
    @Autowired
    IDimCategoryService dimCategoryService;

    @GetMapping("/createCategory")
    @ApiOperation("创建类别")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public String createCategory(@RequestParam String cateName, @RequestParam int orderNum, @ApiParam String cateNote) {
        if (!StringUtils.hasText(cateName)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return dimCategoryService.createCategory(cateName, orderNum, cateNote);
    }

    @GetMapping("/removeCategory")
    @ApiOperation("移除类别")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void removeCategory(@RequestParam String cateId) {
        if (!StringUtils.hasText(cateId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        dimCategoryService.removeCategory(cateId);
    }

    @GetMapping("/setOrderNum")
    @ApiOperation("设置顺序")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void setOrderNum(@RequestParam String cateId, @RequestParam int orderNum) {
        if (!StringUtils.hasText(cateId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        dimCategoryService.setOrderNum(cateId, orderNum);
    }

    @GetMapping("/listCategory")
    @ApiOperation("列出类别")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<DimCategory> listCategory() {
        return dimCategoryService.listCategory();
    }

    @GetMapping("/mountPortletToCategory")
    @ApiOperation("挂载栏目到类别")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void mountPortletToCategory(@RequestParam String portletId, @RequestParam String cateId,@RequestParam int orderNum) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(cateId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        dimCategoryService.mountPortletToCategory(portletId, cateId,orderNum);
    }

    @GetMapping("/unmountPortletToCategory")
    @ApiOperation("卸载栏目自类别")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void unmountPortletToCategory(@RequestParam String portletId, @RequestParam String cateId) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(cateId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        dimCategoryService.unmountPortletToCategory(portletId, cateId);
    }

    @GetMapping("/listPortletByCategory")
    @ApiOperation("列出类别下的栏目")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<ApcPortlet> listPortletByCategory(@RequestParam String cateId) {
        if (!StringUtils.hasText(cateId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return dimCategoryService.listPortletByCategory(cateId);
    }

    @GetMapping("/listCategoryByPortlet")
    @ApiOperation("列出栏目所在的类别")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<DimCategory> listCategoryByPortlet(@RequestParam String portletId) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return dimCategoryService.listCategoryByPortlet(portletId);
    }
}
