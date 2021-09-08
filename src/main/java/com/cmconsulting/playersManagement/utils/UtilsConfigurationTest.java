package com.cmconsulting.playersManagement.utils;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Configuration
public class UtilsConfigurationTest {

    private static  final Logger logger = Logger.getLogger(String.valueOf(UtilsConfigurationTest.class));

    @Bean
    public ObjectClassTest objectClassTest(){
        logger.info("initialisation du bean UtilsConfigurationTest");
        return new ObjectClassTest();
    }
}
