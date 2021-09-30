package com.hyc.springiocserver.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class HelloServer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println("服务已暴露");
        System.in.read();
    }

}
