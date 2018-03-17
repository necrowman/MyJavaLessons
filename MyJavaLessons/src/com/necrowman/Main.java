package com.necrowman;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.calculateFibonachiNumber(7);
        obj.calculateSqureNumber(4);
        obj.calculateClimbStairs(48);
    }

    public void calculateFibonachiNumber(int n){
        FibonachiClass calc = new FibonachiClass();
        System.out.println("Fibonachi (" + n + ") is: " + calc.fibonachi(n));

    }

    public void calculateSqureNumber(int s) {
        SqureNumber calc = new SqureNumber();
        System.out.println("Squre number is: " + calc.calculateSqNump(s));
    }

    public void calculateClimbStairs(int p){
        ClimbStairs calc = new ClimbStairs();
        System.out.println("Climb stairs number is: " + calc.climbStairs(p));
    }
}
