package com.xiongjun.dubbo;


import com.alibaba.dubbo.config.annotation.Service;
import com.xiongjun.dubbo.api.ServerApi;

@Service
public class ServerProvider implements ServerApi {

    @Override
    public String hello() {
        System.out.println("hello dubbo，this is service-provider!");
        return "hello dubbo!";
    }

    @Override
    public int getNum(int num) {
        return num;
    }
}
