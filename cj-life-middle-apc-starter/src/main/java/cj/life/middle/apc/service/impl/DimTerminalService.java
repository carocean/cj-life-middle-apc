package cj.life.middle.apc.service.impl;

import cj.life.ability.api.exception.ApiException;
import cj.life.middle.apc.domain.DimTerminal;
import cj.life.middle.apc.domain.DimTerminalExample;
import cj.life.middle.apc.repository.mapper.DimTerminalMapper;
import cj.life.middle.apc.service.IDimTerminalService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DimTerminalService implements IDimTerminalService {
    @Resource
    DimTerminalMapper dimTerminalMapper;

    @Override
    public String createTerminal(String terminalName, int orderNum, String terminalNote) {
        if (existsTerminalName(terminalName)) {
            throw new ApiException("5000", "The name of terminal type already exist.");
        }
        String idNumSeq = null;
        while (true) {
            idNumSeq = RandomStringUtils.randomNumeric(11);
            DimTerminalExample example = new DimTerminalExample();
            example.createCriteria().andTerminalIdEqualTo(idNumSeq);
            long count = dimTerminalMapper.countByExample(example);
            if (count < 1) {
                break;
            }
        }
        DimTerminal terminal = new DimTerminal();
        terminal.setTerminalId(idNumSeq);
        terminal.setTerminalName(terminalName);
        terminal.setTerminalNote(terminalNote);
        terminal.setOrderNum(orderNum);
        dimTerminalMapper.insertSelective(terminal);
        return idNumSeq;
    }

    private boolean existsTerminalName(String terminalName) {
        DimTerminalExample example = new DimTerminalExample();
        example.createCriteria().andTerminalNameEqualTo(terminalName);
        return dimTerminalMapper.countByExample(example) > 0;
    }

    @Override
    public void removeTerminal(String terminalId) {
        dimTerminalMapper.deleteByPrimaryKey(terminalId);
    }

    @Override
    public List<DimTerminal> listTerminal() {
        DimTerminalExample example = new DimTerminalExample();
        example.createCriteria();
        example.setOrderByClause("order_num asc");
        return dimTerminalMapper.selectByExample(example);
    }

    @Override
    public void setOrderNum(String terminalId, int orderNum) {
        dimTerminalMapper.setOrderNum(terminalId, orderNum);
    }
}
