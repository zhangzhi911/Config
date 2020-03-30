package com.zhangzhi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class dddddd {

    public static void main(String[] args) {
        SpringApplication.run(dddddd.class);
    }


    @RequestMapping("/testHelth")
    public String test(){
        System.out.println("========testHelth=======");
        return "ok-helth";
    }
//
//    @Value("${spring.cloud}")
//    private String config;
//
//    @RequestMapping("/test/config")
//    public String testw() {
//        return config;
//    }
// 呦呦呦，我也是新来的
//    @Value("${spring.cloud}")
//    我是新来的呦呵
}
