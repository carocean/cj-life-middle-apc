package cj.life.middle.apc.web.rest;

import cj.life.ability.api.ResultCode;
import cj.life.ability.api.annotation.ApiResult;
import cj.life.ability.api.exception.ApiException;
import cj.life.ability.mybatis.config.DataSourceConfig;
import cj.life.middle.apc.domain.ApcChannel;
import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.service.IChannelService;
import cj.life.middle.apc.web.IChannelRC;
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
@RequestMapping("/api/v1/channel")
@Api(tags = {"频道管理"})
@Slf4j
public class ChannelResource implements IChannelRC {
    @Autowired
    IChannelService channelService;

    @GetMapping("/createChannel")
    @ApiOperation("创建频道")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public String createChannel(@RequestParam String channelName, @ApiParam int orderNum, @ApiParam String note) {
        if (!StringUtils.hasText(channelName)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return channelService.createChannel(channelName, orderNum, note);
    }

    @GetMapping("/removeChannel")
    @ApiOperation("移除频道")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void removeChannel(@RequestParam String channelId) {
        if (!StringUtils.hasText(channelId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        channelService.removeChannel(channelId);
    }

    @GetMapping("/setOrderNum")
    @ApiOperation("设置频道显示顺序")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void setOrderNum(@RequestParam String channelId, @RequestParam int orderNum) {
        if (!StringUtils.hasText(channelId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        channelService.setOrderNum(channelId, orderNum);
    }

    @GetMapping("/listChannel")
    @ApiOperation("列出道频")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<ApcChannel> listChannel() {
        return channelService.listChannel();
    }

    @GetMapping("/mountPortletToChannel")
    @ApiOperation("挂载栏目到频道")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void mountPortletToChannel(@RequestParam String portletId, @RequestParam String channelId, @RequestParam int orderNum) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(channelId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        channelService.mountPortletToChannel(portletId, channelId, orderNum);
    }

    @GetMapping("/unmountPortletFromChannel")
    @ApiOperation("卸载栏目从频道")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void unmountPortletFromChannel(@RequestParam String portletId, @RequestParam String channelId) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        if (!StringUtils.hasText(channelId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        channelService.unmountPortletFromChannel(portletId, channelId);
    }

    @GetMapping("/listPortletOfChannel")
    @ApiOperation("列出频道栏目")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<ApcPortlet> listPortletOfChannel(@RequestParam String channelId) {
        if (!StringUtils.hasText(channelId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return channelService.listPortletOfChannel(channelId);
    }

    @GetMapping("/listChannelByPortlet")
    @ApiOperation("列出栏目被引用的所有频道")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<ApcChannel> listChannelByPortlet(@RequestParam String portletId) {
        if (!StringUtils.hasText(portletId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return channelService.listChannelByPortlet(portletId);
    }

    @GetMapping("/setOrderNumOfPortletOnChannel")
    @ApiOperation("调整栏目在频道中的顺序")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void setOrderNumOfPortletOnChannel(String portletId, String channelId, int orderNum) {
        channelService.setOrderNumOfPortletOnChannel(portletId, channelId, orderNum);
    }
}
