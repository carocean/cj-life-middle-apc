package cj.life.middle.apc.service;

import cj.life.middle.apc.domain.DimTerminal;

import java.util.List;

public interface IDimTerminalService {
    String createTerminal(String terminalName, int orderNum, String terminalNote);

    void removeTerminal(String terminalId);

    List<DimTerminal> listTerminal();

    void setOrderNum(String terminalId, int orderNum);
}
