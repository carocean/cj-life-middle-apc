package cj.life.middle.apc.service.impl;

import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.domain.FollowAppEmpl;
import cj.life.middle.apc.domain.FollowAppTenant;
import cj.life.middle.apc.repository.mapper.FollowAppEmplMapper;
import cj.life.middle.apc.repository.mapper.FollowAppTenantMapper;
import cj.life.middle.apc.service.IFollowService;
import cj.life.middle.apc.util.IDateUtil;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FollowAppService implements IFollowService {
    @Resource
    FollowAppEmplMapper followAppEmplMapper;
    @Resource
    FollowAppTenantMapper followAppTenantMapper;

    @Override
    public void followByTenant(String tenantId, String appId) {
        FollowAppTenant followAppTenant = new FollowAppTenant();
        followAppTenant.setAppId(appId);
        followAppTenant.setTenantId(tenantId);
        followAppTenant.setFollowTime(IDateUtil.toDateEndMicoSecond(System.currentTimeMillis()));
        followAppTenantMapper.insertSelective(followAppTenant);
    }

    @Override
    public void followByEmployee(String emplId, String appId) {
        FollowAppEmpl followAppEmpl = new FollowAppEmpl();
        followAppEmpl.setAppId(appId);
        followAppEmpl.setEmplId(emplId);
        followAppEmpl.setFollowTime(IDateUtil.toDateEndMicoSecond(System.currentTimeMillis()));
        followAppEmplMapper.insertSelective(followAppEmpl);
    }

    @Override
    public void unfollowByTenant(String tenantId, String appId) {
        followAppTenantMapper.deleteByPrimaryKey(appId, tenantId);
    }

    @Override
    public void unfollowByEmployee(String emplId, String appId) {
        followAppEmplMapper.deleteByPrimaryKey(appId, emplId);
    }

    @Override
    public List<FactApp> listAppByTenant(String tenantId, int limit, long offset) {
        return followAppTenantMapper.listAppByTenant(tenantId, limit, offset);
    }

    @Override
    public List<FactApp> listAppByEmployee(String emplId, int limit, long offset) {
        return followAppEmplMapper.listAppByEmployee(emplId, limit, offset);
    }
}
