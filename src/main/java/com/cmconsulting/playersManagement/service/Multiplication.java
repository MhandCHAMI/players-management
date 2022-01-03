package com.cmconsulting.playersManagement.service;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class Multiplication {

    public int multiply(int a, double b){
        return (int) (a*b);
    }
}
