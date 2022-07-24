package cj.life.middle.apc.web;

//从应用中心购买应用并安装
public interface IInstallerRC {
    void installToTenant();

    void installToEmployee();
}
