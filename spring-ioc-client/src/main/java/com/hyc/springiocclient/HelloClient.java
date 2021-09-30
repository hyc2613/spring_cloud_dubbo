package com.hyc.springiocclient;

import com.hyc.dubbocommon.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloClient {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        HelloService helloService = (HelloService) context.getBean(HelloService.class);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            if (reader.readLine().equals("quit")) {
                break;
            } else {
                String result = helloService.echo("yeah");
                System.out.println(result);
            }
        }
    }

}
