package com.demo.echarts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author ls
 * @Date 2019/05/14 17:00:08
 * @Description
 * @Param 
 * @Return 
 **/

@SpringBootApplication
public class EchartsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EchartsApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EchartsApplication.class);
    }
}
