package com.cmconsulting.playersManagement.service;

public class OperationSG {

    public String testNumber(int i) {
//      return    (i%3==0 && i%5==0) ? "C" : ((i%3 == 0) ? "A" : (i%5 == 0 ? "B" : String.valueOf(i))) ;
        if(i%3==0 && i%5==0) return "C";
        if(i%3 == 0) return "A";
        if(i%5 ==0) return "B";
     return  String.valueOf(i) ;
    }
}
