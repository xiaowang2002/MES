package com.atwzs.mes;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 王志生
 */
@SpringBootApplication
@Slf4j
@MapperScan("com.atwzs.mes.dao")
public class MesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MesApplication.class, args);
        log.info("项目启动成功");
    }

}
