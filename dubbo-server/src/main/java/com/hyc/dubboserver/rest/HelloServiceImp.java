package com.hyc.dubboserver.rest;

import com.hyc.dubbocommon.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Service
@Slf4j
public class HelloServiceImp implements HelloService {

    @Override
    public String echo(String message) {
        log.info("dubbo server hello method.");
        return "hello, "+message;
    }
}
