package com.generics;

public class FindMaximum {

    public Integer firstNumber = 0;
    public Integer secondNumber = 0;
    public Integer thirdNumber = 0;

    public Integer MaximumNumber(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
        if(firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0){
            return firstNumber;
        }
        else if(secondNumber.compareTo(thirdNumber) > 0){
            return secondNumber;
        }
        else{
            return thirdNumber;
        }

    }
}
