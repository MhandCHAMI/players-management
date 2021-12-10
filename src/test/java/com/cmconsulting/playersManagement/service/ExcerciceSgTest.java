package com.cmconsulting.playersManagement.service;

import org.junit.Assert;
import org.junit.Test;

public class ExcerciceSgTest {

    OperationSG operationSG = new OperationSG();

    @Test
    public void it_souhld_return_1_when_entry_1(){
        String result = operationSG.testNumber(1);
        Assert.assertEquals("1",result);
    }

    @Test
    public void it_souhld_return_2_when_entry_2(){
        String result = operationSG.testNumber(2);
        Assert.assertEquals("2",result);
    }

    @Test
    public void it_souhld_return_3_when_entry_3(){
        String result = operationSG.testNumber(3);
        Assert.assertEquals("A",result);
    }

    @Test
    public void it_souhld_return_B_when_entry_5(){
        String result = operationSG.testNumber(5);
        Assert.assertEquals("B",result);
    }

    @Test
    public void it_souhld_return_A_when_entry_multiple_3(){
        String result = operationSG.testNumber(6);
        String result1 = operationSG.testNumber(9);
        String result2 = operationSG.testNumber(12);
        Assert.assertEquals("A",result1);
        Assert.assertEquals("A",result2);
        Assert.assertEquals("A",result);
    }
    @Test
    public void it_souhld_return_B_when_entry_multiple_5(){
        String result = operationSG.testNumber(5);
        String result1 = operationSG.testNumber(10);
        String result2 = operationSG.testNumber(20);
        Assert.assertEquals("B",result1);
        Assert.assertEquals("B",result2);
        Assert.assertEquals("B",result);
    }

    @Test
    public void it_souhld_return_C_when_entry_multiple_5_AND_3(){
        String result = operationSG.testNumber(15);
        String result1 = operationSG.testNumber(30);
        Assert.assertEquals("C",result1);
        Assert.assertEquals("C",result);
    }

}
