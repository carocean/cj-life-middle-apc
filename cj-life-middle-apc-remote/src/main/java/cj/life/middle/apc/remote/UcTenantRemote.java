package cj.life.middle.apc.remote;

import cj.life.middle.uc.domain.UcTenant;
import cj.life.middle.uc.domain.UcUser;
import cj.life.middle.uc.web.ITenantRC;
import cj.life.middle.uc.web.IUserRC;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(contextId = "ucTenantRemote", value = "cj-life-middle-uc", url = "${life.test.feign.adapter.docker.uc.url:}")
public interface UcTenantRemote extends ITenantRC {
    @RequestMapping("/api/v1/tenant/getTenant")
    @Override
    UcTenant getTenant(@RequestParam String tenantId);
}
