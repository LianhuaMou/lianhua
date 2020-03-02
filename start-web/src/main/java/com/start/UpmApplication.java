package com.start;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@Slf4j
@SpringBootApplication(scanBasePackages = "com.start")
@MapperScan(basePackages = "com.start.dao.mapper")
@EnableCaching
public class UpmApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(UpmApplication.class, args);
            log.info("#############################################");
            log.info("#####-----启动成功-----#####");
            log.info("#############################################");
        } catch (Exception e) {
            log.info("#############################################");
            log.info("#####启动失败#####");
            log.info("#############################################");
        }
    }
}
