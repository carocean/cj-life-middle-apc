package cj.life.middle.apc.remote;

import cj.life.middle.uc.domain.UcApp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
//指定url即跳过了注册中心
//@FeignClient(value = "cj-life-middle-uc",url = "localhost:8080")
@FeignClient(name = "cj-life-middle-uc",url = "${life.test.feign.adapter.docker.uc.url:}")
public interface UcAppRemote {
    /**
     * 增量更新用户信息
     */
    @RequestMapping("/api/v1/app/getApp")
//    @Override
    UcApp getApp(@RequestParam String appId);
    @RequestMapping("/api/v1/app/listApp")
//    @Override
    List<UcApp> listApp(@RequestParam int limit, @RequestParam long offset);
}
