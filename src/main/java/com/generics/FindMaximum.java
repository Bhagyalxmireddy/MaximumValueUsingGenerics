package com.generics;

public class FindMaximum {

    public Integer firstNumber = 0;
    public Integer secondNumber = 0;
    public Integer thirdNumber = 0;
    public double firstFloat = 0;
    public double secondFloat = 0;
    public double thirdFloat = 0;
    public String firstString;
    public String secondString;
    public String thirdString;

    public Integer MaximumNumber(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
        if(firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0){
            return firstNumber;
        }
        else if(secondNumber.compareTo(thirdNumber) > 0) {
            return secondNumber;
        }
        else{
            return thirdNumber;
        }

    }

    public double MaximumFloatNum(double firstFloat, double secondFloat, double thirdFloat) {

        if(Double.compare(firstFloat,secondFloat)> 0){
            return firstFloat;
        }
        else if(Double.compare(secondFloat,thirdFloat) > 0) {
            return secondFloat;
        }
        else{
            return thirdFloat;
        }

    }

    public String MaximumString(String firstString,String secondString,String thirdString) {
        if(firstString.compareTo(secondString) > 0){
            return firstString;
        }
        else if(secondString.compareTo(thirdString) > 0){
            return secondString;
        }
        else{
            return thirdString;
        }

    }
}
