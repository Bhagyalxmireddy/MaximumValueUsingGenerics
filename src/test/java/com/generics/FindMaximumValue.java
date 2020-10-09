package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumValue {

    @Test
    public void givenThreeIntegers_WhenFirstPositionIsMax_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
       Integer maxValue = findMaximum.MaximumNumber(9,6,3);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeIntegers_WhenSecondPositionIsMax_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.MaximumNumber(6,9,3);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeIntegers_WhenThirdPositionIsMax_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.MaximumNumber(3,6,9);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenFirstPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
         double maxValue = (double) findMaximum.MaximumFloatNum(3.3,2.2, 1.1);
        Assert.assertSame(3.3,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenSecondPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        double maxValue = (double) findMaximum.MaximumFloatNum(2.2,3.3, 1.1);
        Assert.assertSame(3.3,maxValue);
    }
    @Test
    public void givenThreeFloats_WhenThirdPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        double maxValue = (double) findMaximum.MaximumFloatNum(1.1f,2.2f, 3.3f);
        Assert.assertSame((double)3.3,maxValue);
    }
    @Test
    public void givenThreeStrings_WhenFirstPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maxValue = findMaximum.MaximumString("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maxValue);
    }
    @Test
    public void givenThreeStrings_WhenSecondPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maxValue = findMaximum.MaximumString("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxValue);
    }



}
