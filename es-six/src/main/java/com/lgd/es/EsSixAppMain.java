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
 * @date 2018/6/15
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lgd.es.controller",
        "com.lgd.es.service",
        "com.lgd.es.dao",
        "com.lgd.es.cfg"})
@Configuration
@ServletComponentScan
public class EsSixAppMain {

    public static void main(String[] args) {
        SpringApplication.run(EsSixAppMain.class, args);
    }


}
