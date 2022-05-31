package com.kodilla;

public class Calculator{

    public double add(double a, double b){
        return a+b;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.add(5, 5);
        calculator.subtract(10,4);
    }

}
