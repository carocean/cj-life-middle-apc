package cj.life.middle.apc.web.rest;

import cj.life.ability.api.ResultCode;
import cj.life.ability.api.annotation.ApiResult;
import cj.life.ability.api.exception.ApiException;
import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.service.IFollowService;
import cj.life.middle.apc.web.IFollowRC;
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
@RequestMapping("/api/v1/app/follow")
@Api(tags = {"应用关注管理"})
@Slf4j
public class FollowResource implements IFollowRC {
    @Autowired
    IFollowService followService;

    @GetMapping("/followByTenant")
    @ApiOperation("关注应用【由租户】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void followByTenant(@RequestParam String tenantId, @RequestParam String appId) {
        if (!StringUtils.hasText(tenantId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        followService.followByTenant(tenantId, appId);
    }

    @GetMapping("/followByEmployee")
    @ApiOperation("关注应用【由员工】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void followByEmployee(@RequestParam String emplId, @RequestParam String appId) {
        if (!StringUtils.hasText(emplId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        followService.followByEmployee(emplId, appId);
    }

    @GetMapping("/unfollowByTenant")
    @ApiOperation("取消关注【由租户】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void unfollowByTenant(@RequestParam String tenantId, @RequestParam String appId) {
        if (!StringUtils.hasText(tenantId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        followService.unfollowByTenant(tenantId, appId);
    }

    @GetMapping("/unfollowByEmployee")
    @ApiOperation("取消关注【由员工】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void unfollowByEmployee(@RequestParam String emplId, @RequestParam String appId) {
        if (!StringUtils.hasText(emplId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(appId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        followService.unfollowByEmployee(emplId, appId);
    }

    @GetMapping("/listAppByTenant")
    @ApiOperation("列出应用【租户的】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public List<FactApp> listAppByTenant(@RequestParam String tenantId, @RequestParam int limit, @RequestParam long offset) {
        if (!StringUtils.hasText(tenantId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return followService.listAppByTenant(tenantId, limit, offset);
    }

    @GetMapping("/listAppByEmployee")
    @ApiOperation("列出应用【员工的】")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public List<FactApp> listAppByEmployee(@RequestParam String emplId, @RequestParam int limit, @RequestParam long offset) {
        if (!StringUtils.hasText(emplId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return followService.listAppByEmployee(emplId, limit, offset);
    }
}
