package com.hyc.dubbo.server;

import com.hyc.dubbo.client.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

public class UserServer {

    public static void main(String[] args) throws IOException {
        // 给服务起个名字
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-user-service-server");
        ProtocolConfig protocolConfig = new ProtocolConfig("dubbo");
        // 端口号自动递增1，从20880开始
        protocolConfig.setPort(-1);
        // 暂时不要服务注册中心
        RegistryConfig registryConfig = new RegistryConfig(RegistryConfig.NO_AVAILABLE);
        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(new UserServiceImpl());

        serviceConfig.export();
        // 为了不让服务关闭
        System.in.read();
    }

}
