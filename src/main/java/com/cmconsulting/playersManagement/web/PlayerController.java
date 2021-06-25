package com.cmconsulting.playersManagement.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
@Slf4j
public class PlayerController {

    @Value("${valueTest}")
    private String prioritySystemProperty;

    @GetMapping("/value")
    public String getValue()
    {
        System.out.println(prioritySystemProperty);
        return prioritySystemProperty;
    }




}
