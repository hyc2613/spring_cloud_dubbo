package com.hyc.dubbo.client;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

public class UserServiceClient {

    public static void main(String[] args) {
        ApplicationConfig applicationConfig = new ApplicationConfig("dubbo-user-service-client");
        RegistryConfig registryConfig = new RegistryConfig(RegistryConfig.NO_AVAILABLE);
        ReferenceConfig referenceConfig = new ReferenceConfig();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(UserService.class);
        referenceConfig.setUrl("dubbo://172.16.21.50:20880/com.hyc.dubbo.client.UserService");

        UserService userService = (UserService) referenceConfig.get();
        User user = userService.getUserById(1);
        System.out.println(user);
    }


}
