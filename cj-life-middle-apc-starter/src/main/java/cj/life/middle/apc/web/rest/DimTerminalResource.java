package cj.life.middle.apc.web.rest;

import cj.life.ability.api.ResultCode;
import cj.life.ability.api.annotation.ApiResult;
import cj.life.ability.api.exception.ApiException;
import cj.life.ability.mybatis.config.DataSourceConfig;
import cj.life.middle.apc.domain.DimTerminal;
import cj.life.middle.apc.service.IDimTerminalService;
import cj.life.middle.apc.web.IDimTerminalRC;
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
@RequestMapping("/api/v1/dim/terminal")
@Api(tags = {"维度::终端类型管理"})
@Slf4j
public class DimTerminalResource implements IDimTerminalRC {
    @Autowired
    IDimTerminalService dimTerminalService;

    @GetMapping("/createTerminal")
    @ApiOperation("创建终端类型")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public String createTerminal(@RequestParam String terminalName, @ApiParam int orderNum, @ApiParam String terminalNote) {
        if (!StringUtils.hasText(terminalName)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        return dimTerminalService.createTerminal(terminalName, orderNum, terminalNote);
    }

    @GetMapping("/removeTerminal")
    @ApiOperation("移除终端类型")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void removeTerminal(@RequestParam String terminalId) {
        if (!StringUtils.hasText(terminalId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        dimTerminalService.removeTerminal(terminalId);
    }

    @GetMapping("/listTerminal")
    @ApiOperation("列出终端类型")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @DataSourceConfig.ReadOnly
    @Override
    public List<DimTerminal> listTerminal() {
        return dimTerminalService.listTerminal();
    }

    @GetMapping("/setOrderNum")
    @ApiOperation("设置终端类型顺序")
    @ApiResult
    @ApiResponses({
            @ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "1002", description = "null_parameter"),
    })
    @Override
    public void setOrderNum(@RequestParam String terminalId, @ApiParam int orderNum) {
        if (!StringUtils.hasText(terminalId)) {
            throw new ApiException(ResultCode.PARAM_IS_BLANK);
        }
        dimTerminalService.setOrderNum(terminalId, orderNum);
    }
}
