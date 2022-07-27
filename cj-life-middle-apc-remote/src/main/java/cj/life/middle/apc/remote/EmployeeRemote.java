package cj.life.middle.apc.remote;

import cj.life.middle.uc.domain.TenantEmpl;
import cj.life.middle.uc.web.ITenantEmployeeRC;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(contextId = "employeeRemote",value = "cj-life-middle-uc", url = "${life.test.feign.adapter.docker.uc.url:}")
public interface EmployeeRemote extends ITenantEmployeeRC {
    @RequestMapping("/api/v1/tenant/employee/getEmployee")
    @Override
    TenantEmpl getEmployee(@RequestParam String emplId);
}
