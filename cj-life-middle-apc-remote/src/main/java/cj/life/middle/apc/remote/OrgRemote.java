package cj.life.middle.apc.remote;

import cj.life.middle.uc.domain.UcOrg;
import cj.life.middle.uc.domain.UcUser;
import cj.life.middle.uc.web.IOrgRC;
import cj.life.middle.uc.web.IUserRC;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(contextId = "orgRemote", value = "cj-life-middle-uc", url = "${life.test.feign.adapter.docker.uc.url:}")
public interface OrgRemote extends IOrgRC {
    @RequestMapping("/api/v1/org/getOrgByTenant")
    @Override
    UcOrg getOrgByTenant(@RequestParam String tenantId);
}
