package com.xiongjun.controller;

import com.xiongjun.dubbo.api.ServerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private ServerApi serverApi;

    @GetMapping("/checkDubboService")
    public String checkDubboService(){
        String ss = serverApi.hello();
        System.out.println(ss + ", this is dubbo-consumer");
        return ss;
    }

}
