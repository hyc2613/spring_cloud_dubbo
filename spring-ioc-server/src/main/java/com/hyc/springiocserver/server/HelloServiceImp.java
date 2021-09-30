package com.hyc.springiocserver.server;


import com.hyc.dubbocommon.HelloService;

public class HelloServiceImp implements HelloService {
    @Override
    public String echo(String message) {
        return "hello, this is spring-ioc-dubbo."+message;
    }
}
