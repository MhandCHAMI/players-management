package com.cmconsulting.playersManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Service
public class CalculeImpot {

    @Autowired
    Multiplication multiplication;

    public CalculeImpot() {
        initData();
    }

    Map<Integer, Double> map = new TreeMap<>();


    public void initData() {
        map.put(10000, 0.0);
        map.put(27000, 0.11);
        map.put(73000, 0.30);
        map.put(145000, 0.41);
        map.put(Integer.MAX_VALUE, 0.45);
    }



    public int calculeImpotParticulier(int montant){
        int fixe = 0;
        int palierLast = 0;
        for (Map.Entry<Integer, Double> entry : map.entrySet()){
            if (montant > entry.getKey()) {
                fixe += multiplication.multiply((entry.getKey() - palierLast), entry.getValue());
                palierLast = entry.getKey();
            }
            else{
                fixe+=(montant - palierLast) * entry.getValue();
                return fixe;
            }
        }
        return fixe;
    }






}
