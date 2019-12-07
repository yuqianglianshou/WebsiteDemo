package com.gosky.sf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//    启动类修改:继承SpringBootServletInitializer覆盖configure方法

@SpringBootApplication
public class SfApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SfApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SfApplication.class);//注意此处有修改
    }
}
