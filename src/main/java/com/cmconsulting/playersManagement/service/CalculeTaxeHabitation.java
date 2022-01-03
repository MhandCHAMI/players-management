package com.cmconsulting.playersManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculeTaxeHabitation {

    @Autowired
    Addition addition;



    public int calculTaxeHabitation(int a, int b){
        return addition.addtion(a,b);
    }
}
