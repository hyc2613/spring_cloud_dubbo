package com.hyc.dubboclient;

import com.hyc.dubbocommon.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboClientController {

    @Reference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.echo("number1");
    }

}
