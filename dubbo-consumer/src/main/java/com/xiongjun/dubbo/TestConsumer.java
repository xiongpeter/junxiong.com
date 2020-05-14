package com.xiongjun.dubbo;

import com.xiongjun.dubbo.api.ServerApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumer {

    public static void main(String[] args){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
        ac.start();
        ServerApi ta = (ServerApi) ac.getBean("dubboService");
        String ss = ta.hello();
        System.out.println(ss + ", this is dubbo-consumer");
        System.out.println(ta.getNum(125));
    }
}
