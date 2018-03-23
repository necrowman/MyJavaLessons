package com.necrowman;
import java.sql.Timestamp;
import java.security.cert.CertPath;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.calculateSqureNumber(4);

        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        obj.calculateFibonachiNumber(4);
        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
        System.out.println("calculated for (" + timestamp2 + " - " + timestamp1 + ") seconds");


//        obj.calculateSqureNumber(4);

        Timestamp timestamp3 = new Timestamp(System.currentTimeMillis());
        obj.calculateClimbStairs(91);
        Timestamp timestamp4 = new Timestamp(System.currentTimeMillis());
        System.out.println("calculated for (" + timestamp4 + " - " + timestamp3 + ") seconds");

        Timestamp timestamp5 = new Timestamp(System.currentTimeMillis());
        obj.calculateClimbStairs(91);
        Timestamp timestamp6 = new Timestamp(System.currentTimeMillis());
        System.out.println("calculated for (" + timestamp6 + " - " + timestamp5 + ") seconds");
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
        System.out.println("Climb stairs number for " + p +" is: " + calc.climbStairs(p));
    }
}
