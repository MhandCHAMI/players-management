package com.cmconsulting.playersManagement.utils;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

public class ObjectClassTest {

    private static  final Logger logger = Logger.getLogger(String.valueOf(ObjectClassTest.class));


    @PostConstruct
    public void initBean(){
        logger.info("execution de la medthode postconstruct");
    }


    public String test(){
        return "execution de la methode test ---------";
    }
}
