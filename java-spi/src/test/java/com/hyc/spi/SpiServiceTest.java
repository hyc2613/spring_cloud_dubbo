package com.hyc.spi;

import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;


public class SpiServiceTest {

    @Test
    public void testSpi() {
        ServiceLoader<SpiService> serviceLoader = ServiceLoader.load(SpiService.class);
        Iterator<SpiService> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            SpiService spiService = (SpiService) iterator.next();
            System.out.println(spiService.getClass().getName());
            spiService.hello();
        }

    }

}
