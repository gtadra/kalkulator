package com.kodilla.Kalkulator;

public class Calculator {

    public void sum(int valueA, int valueB){
        System.out.println(valueA + " + " + valueB + " = " + (valueA + valueB));
    }

    public void sub(int valueA, int valueB){
        System.out.println(valueA + " - " + valueB + " = " + (valueA - valueB));
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.sum(5,10);
        calculator.sub(5,10);
    }

}
