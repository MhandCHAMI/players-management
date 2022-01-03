package com.cmconsulting.playersManagement.service;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculeTaxeHabitationTest {

//    @InjectMocks
//    CalculeTaxeHabitation calculeTaxeHabitation;
//
//    @Mock
//    Addition addition;
//
//
//    @Test
//    public void it_should_calculTaxeHabitation_thenApply(){
//        Mockito.when(addition.addtion(Mockito.anyInt(), Mockito.anyInt())).thenReturn(8);
//        int result = calculeTaxeHabitation.calculTaxeHabitation(1,3);
//
//        Assertions.assertEquals(5, result);
//    }


    @BeforeAll
    public void init(){
        System.out.println("i'm in methode init");
    }

    @Test
    public void test_1(){
        System.out.println("je suis le test1");
    }

    @Test
    public void test_2(){
        System.out.println("je suis le test2");
    }
    @Test
    public void test_3(){
        System.out.println("je suis le test3");
    }


}
