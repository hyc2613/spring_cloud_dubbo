package com.hyc.spi.service;

import com.hyc.spi.SpiService;

public class TomSpiServiceImpl implements SpiService {
    @Override
    public void hello() {
        System.out.println("hello, this is tom.");
    }
}
