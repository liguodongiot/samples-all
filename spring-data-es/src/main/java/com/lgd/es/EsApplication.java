package com.lgd.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Project: samples-all</p>
 * <p>Package: com.lgd.es</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/5/18 11:05 星期五
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lgd.es.controller",
        "com.lgd.es.service",
        "com.lgd.es.dao"})
@Configuration
@ServletComponentScan
public class EsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class, args);
    }

}
