package com.necrowman;


public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.calculateFibonachiNumber(5);
    }

    public void calculateFibonachiNumber(int n){
        FibonachiClass calc = new FibonachiClass();
        System.out.println("Fibonachi (" + n + ") is: " + calc.fibonachi(n));

    }
}
