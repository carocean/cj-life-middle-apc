package cj.life.middle.apc.web;

import cj.life.middle.apc.domain.FactApp;

import java.util.List;

//当购买后触发：关注应用即到租户和员工应用列表，表示认购完毕
public interface IFollowRC {
    void followByTenant(String tenantId, String appId);

    void followByEmployee(String emplId, String appId);

    void unfollowByTenant(String tenantId, String appId);

    void unfollowByEmployee(String emplId, String appId);

    List<FactApp> listAppByTenant(String tenantId, int limit, long offset);

    List<FactApp> listAppByEmployee(String emplId, int limit, long offset);
}
