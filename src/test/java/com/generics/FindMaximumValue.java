package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumValue {

    @Test
    public void givenThreeIntegers_WhenFirstPositionIsMax_ShouldReturnSameNumber(){
       Integer maxValue = FindMaximum.maximum(9,6,3);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeIntegers_WhenSecondPositionIsMax_ShouldReturnSameNumber(){
        Integer maxValue = FindMaximum.maximum(6,9,3);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeIntegers_WhenThirdPositionIsMax_ShouldReturnSameNumber(){

        Integer maxValue = FindMaximum.maximum(3,6,9);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenFirstPositionIsMax_ShouldReturnSameNumber()
    {
        Double maxValue =  FindMaximum.maximum(3.3,2.2, 1.1);
        Assert.assertEquals( (Double) 3.3,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenSecondPositionIsMax_ShouldReturnSameNumber()
    {
        Double maxValue =  FindMaximum.maximum(2.2,3.3, 1.1);
        Assert.assertEquals((Double) 3.3,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenThirdPositionIsMax_ShouldReturnSameNumber()
    {
        Double maxValue =  FindMaximum.maximum(1.1,2.2, 3.3);
        Assert.assertEquals( (Double) 3.3,maxValue);
    }
    @Test
    public void givenThreeStrings_WhenFirstPositionIsMax_ShouldReturnSameNumber()
    {
        String maxValue = FindMaximum.maximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maxValue);
    }
    @Test
    public void givenThreeStrings_WhenSecondPositionIsMax_ShouldReturnSameNumber()
    {
        String maxValue = FindMaximum.maximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxValue);
    }
    @Test
    public void givenThreeStrings_WhenThirdPositionIsMax_ShouldReturnSameNumber()
    {
        String maxValue = FindMaximum.maximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",maxValue);
    }
    @Test
    public void givenOptinalIntegers_WhenFirstPositionIsMax_ShouldReturnSameNumber(){
        Integer maxValue = FindMaximum.maximum(9,6,3,2);
        Assert.assertSame(9,maxValue);
    }

}
