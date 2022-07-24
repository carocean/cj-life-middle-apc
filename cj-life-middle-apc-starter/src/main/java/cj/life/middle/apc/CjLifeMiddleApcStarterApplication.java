package cj.life.middle.apc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"cj.life.ability", "cj.life.middle.apc"})
@MapperScan({"cj.life.middle.apc.**.repository.mapper"})
@EnableEurekaClient
@EnableTransactionManagement
public class CjLifeMiddleApcStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CjLifeMiddleApcStarterApplication.class, args);
    }

}
