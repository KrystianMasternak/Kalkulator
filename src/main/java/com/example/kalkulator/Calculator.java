package com.example.kalkulator;

public class Calculator {
    int a;
    int b;


    public int adding(int a, int b){
        return a + b;

    }

    public int subtraction(int a, int b){
        return a - b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
         int result = calculator.adding(32,6);
        int result1 = calculator.subtraction(6,28);

        System.out.println(result);
        System.out.println(result1);
    }
}
