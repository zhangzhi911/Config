package com.zhangzhi.web;

import com.alibaba.fastjson.JSON;
import com.zhangzhi.config.MyTestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class TestCntroller {

    @Autowired
    public MyTestConfig myTestConfig;


    @RequestMapping("test001")
    public String test(){
        return JSON.toJSONString(myTestConfig);
    }

//    @Value("${spring.cloud}")
//    private String config;
//
//    @RequestMapping("/test/config")
//    public String testw() {
//        return config;
//    }

}
