package cj.life.middle.apc.web;

import cj.life.middle.apc.domain.DimTerminal;

import java.util.List;

public interface IDimTerminalRC {
    String createTerminal(String terminalName, int orderNum, String terminalNote);

    void removeTerminal(String terminalId);

    List<DimTerminal> listTerminal();

    void setOrderNum(String terminalId, int orderNum);
}
