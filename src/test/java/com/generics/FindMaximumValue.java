package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumValue {

    @Test
    public void givenThreeIntegers_WhenFirstPositionIsMax_ShouldReturnFirstNumber(){
        FindMaximum findMaximum = new FindMaximum();
       Integer maxValue = findMaximum.MaximumNumber(9,6,3);
        Assert.assertSame(9,maxValue);
    }
}
