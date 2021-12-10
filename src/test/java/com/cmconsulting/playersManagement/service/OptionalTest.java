package com.cmconsulting.playersManagement.service;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class OptionalTest {


    @Test
    public void whenCreateEmptyOptional_thenCorrect(){
        Optional<String> optStr = Optional.empty();
        Assert.assertFalse(optStr.isPresent());
    }

    @Test
    public void whenCreateNotNullableptional_thenCorrect(){
        Optional<String> optStr = Optional.of("Mhand");
        Assert.assertTrue(optStr.isPresent());
    }

    @Test(expected = NullPointerException.class)
    public void givenNull_whenThrowsErrorOnCreate_thenCorrectly(){
        Optional<String> optStr = Optional.of(null);
    }

    @Test
    public void GivenNullValue_whenNullable_thenCorrectly(){
        Optional<String> optStr = Optional.ofNullable(null);
        Assert.assertFalse(optStr.isPresent());
    }

    /*
    l'avantage d'utiliser l'optional dans cette exemple c'est d'éviter l'erreur nullPointerException
    lors de l'exécution de la méthode optstr.length()
     */
    @Test
    public void givenOptional_whenIsPresentWorks_thenCorrect(){
        Optional<String> optStr = Optional.of("mhand");
        optStr.ifPresent( t -> System.out.println(t.length()));
    }

    //mthode orElse
    @Test
    public void whenOrElseWorks_thenCorrectly(){
        String str = null;
        String str2 = Optional.ofNullable(str).orElse("mhand");
        Assert.assertEquals("mhand", str2);
    }

    //methode orElseGet
    @Test
    public void whenOrElseGetWorks_thenCorrectly(){
        String str = null;
        String str2 = Optional.ofNullable(str).orElseGet(()->"Mhand");
        Assert.assertEquals("mhand", str2);
    }

    /*
     * la différence entre orElseGet et orElse
     * quand la valeur de l'optionnal est null, elles ont le même comportement, les deux s'exécutent
     * quand la valeur de l'optionnal n'est pas null la fonction orElseGet ne s'exécutent pas car la premiere condition est vérifiée
     * tandis que la fonction orElse s'exécutent dans tous les cas meme si la condition est vérifiée
     * on peut vérifier ça dans les deux tests suivants, dans le test2 la méthode  methodeTest s'exécute malgré que la valeur de str n'est pas null
     */
    public String methodeTest(){
        System.out.println("exécution de la méthode methodeTest");
        return "MhandTestOne";
    }

    @Test
    public void whenOrElseGetAndOrElse_SameBehavior_thenCorectly(){
        String str = null;
        String str2 = Optional.ofNullable(str).orElseGet(this::methodeTest);
        Assert.assertEquals("MhandTestOne", str2);

        String str3 = Optional.ofNullable(str).orElse(methodeTest());
        Assert.assertEquals("MhandTestOne", str3);

    }

    @Test
    public void whenOrElseGetAndOrElse_NotSameBehavior_thenCorectly(){
        String str = "Mhand";
        String str2 = Optional.ofNullable(str).orElseGet(this::methodeTest);
        Assert.assertEquals("Mhand", str2);

        String str3 = Optional.ofNullable(str).orElse(methodeTest());
        Assert.assertEquals("Mhand", str3);
    }


}
