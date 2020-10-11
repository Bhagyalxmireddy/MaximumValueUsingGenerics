package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumValue {

    @Test
    public void givenThreeIntegers_WhenFirstPositionIsMax_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
       Integer maxValue = findMaximum.Maximum(9,6,3);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeIntegers_WhenSecondPositionIsMax_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.Maximum(6,9,3);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeIntegers_WhenThirdPositionIsMax_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.Maximum(3,6,9);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenFirstPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        Double maxValue =  findMaximum.Maximum(3.3,2.2, 1.1);
        Assert.assertEquals((Double) 3.3,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenSecondPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        Double maxValue =  findMaximum.Maximum(2.2,3.3, 1.1);
        Assert.assertEquals((Double) 3.3,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenThirdPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        Double maxValue = findMaximum.Maximum(1.1,2.2, 3.3);
        Assert.assertEquals((Double) 3.3,maxValue);
    }
    @Test
    public void givenThreeStrings_WhenFirstPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maxValue = findMaximum.Maximum("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maxValue);
    }
    @Test
    public void givenThreeStrings_WhenSecondPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maxValue = findMaximum.Maximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxValue);
    }
    @Test
    public void givenThreeStrings_WhenThirdPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maxValue = findMaximum.Maximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",maxValue);
    }



}
