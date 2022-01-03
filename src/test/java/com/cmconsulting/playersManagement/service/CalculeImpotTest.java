package com.cmconsulting.playersManagement.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class CalculeImpotTest {

    @InjectMocks
    CalculeImpot calculeImpot;

    @Mock
    Multiplication multiplication;


       /*
        0 to 10000 --> 0%
        1000 to 27000 --> 11%
        27000 to 73000 --> 30%
        73000 to 145000 -->41%
        sup 145000 --> 45%
        */

//    @Test
//    public void it_shoult_return_0_when_revenu_inf_10000(){
//        int result = calculeImpot.calculeImpotParticulier(9000);
//        Assertions.assertEquals(0, result);
//    }

    @Test
    public void it_shoult_return_0_when_revenu_sup_10000_and_inf_27000(){

        lenient().when(multiplication.multiply(anyInt(),anyInt())).thenReturn(5);

//        int result = calculeImpot.calculeImpotParticulier(20000);
        Assertions.assertEquals(1100, 10);
    }


//
//    @Test
//    public void it_shoult_return_0_when_revenu_sup_27000_and_inf_73000(){
//        int result = calculeImpot.calculeImpotParticulier(60000);
//        Assertions.assertEquals(11770, result);
//    }
//
//    @Test
//    public void it_shoult_return_0_when_revenu_sup_73000_and_inf_145000(){
//        int result = calculeImpot.calculeImpotParticulier(100000);
//        Assertions.assertEquals(26740 , result);
//    }




}
