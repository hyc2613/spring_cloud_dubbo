package com.hyc.spi.service;

import com.hyc.spi.SpiService;

/**
 * spi接口的实现类
 *
 * 注意：这个类的全限定名必须要在  META-INF/services/接口全名 的文件中定义
 */
public class JackSpiServiceImpl implements SpiService {
    @Override
    public void hello() {
        System.out.println("hello, this is jacky!");
    }
}
