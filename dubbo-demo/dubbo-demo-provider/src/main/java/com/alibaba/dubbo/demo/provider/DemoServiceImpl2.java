package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.DemoService;
import com.alibaba.dubbo.demo.MyDemo;
import com.alibaba.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoServiceImpl2 implements MyDemo {

    @Override
    public String sayHello(String name) {
        System.out.println("I am demo2");
        return "demo 2";
    }

}
