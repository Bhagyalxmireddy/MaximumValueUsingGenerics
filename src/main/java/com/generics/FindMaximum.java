package com.generics;


import java.io.PrintStream;

public class FindMaximum<T extends Comparable<T>> {
    T x, y, z;

    public FindMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {
        return FindMaximum.maximum(x, y, z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z, T...optionalvalue) {
        T max ;
        if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            max = x;
        }
        else if (y.compareTo(z) > 0) {
            max = y;
        }
        else{
            max = z;
        }
        if(optionalvalue.length != 0){
            for(int count = 0; count < optionalvalue.length -1;count++){
                if(optionalvalue[count].compareTo(optionalvalue[count+1]) > 0 && optionalvalue[count].compareTo(max) >0)
                {
                    max = optionalvalue[count];
                }
            }
        } return max;
    }
    public static <T> void printMax(T x,T y,T z,T optionalvalue,T max){
        System.out.printf("max of %s,%s and %s is %s\n",x,y,z,optionalvalue,max);
    }

}

