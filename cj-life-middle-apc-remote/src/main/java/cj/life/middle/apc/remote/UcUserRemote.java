package cj.life.middle.apc.remote;

import cj.life.middle.uc.domain.UcUser;
import cj.life.middle.uc.web.IUserRC;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(contextId = "ucUserRemote", value = "cj-life-middle-uc", url = "${life.test.feign.adapter.docker.uc.url:}")
public interface UcUserRemote extends IUserRC {
    @RequestMapping("/api/v1/user/getUser")
    @Override
    UcUser getUser(@RequestParam String uid);
}
