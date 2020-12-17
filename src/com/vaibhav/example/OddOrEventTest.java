package com.vaibhav.example;


import mockit.Deencapsulation;
import mockit.Mock;
import mockit.MockUp;
import org.junit.Assert;
import org.junit.Test;

public class OddOrEventTest {

    @Test
    public void twoIsEven(){
        boolean result = Deencapsulation.invoke(OddOrEven.class, "isEven", 2);
        Assert.assertEquals(true, result);
    }



}
