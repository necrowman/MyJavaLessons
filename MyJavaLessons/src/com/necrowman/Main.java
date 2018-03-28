package com.necrowman;
import java.sql.Timestamp;
import java.security.cert.CertPath;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.calculateSqureNumber(4);
        obj.calculateNums(new int [] {1, 2, 3, 2, 1});
        obj.calculateNums(new int [] {1, 2, 3, 5, 1});
        obj.calculateNums(new int [] {7, 5, 7, 5});
        obj.calculateNums(new int [] {7, 4, 3, 5});
        obj.calculateNums(new int [] {});



//        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
//        obj.calculateFibonachiNumber(4);
//        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
//        System.out.println("calculated for (" + timestamp2 + " - " + timestamp1 + ") seconds");
//
//
//        obj.twoSum(new int[]{1, 3, 6, 4, 1, 6, 8, 5},12);
//
////        obj.calculateSqureNumber(4);
//
//        Timestamp timestamp3 = new Timestamp(System.currentTimeMillis());
//        obj.calculateClimbStairs(91);
//        Timestamp timestamp4 = new Timestamp(System.currentTimeMillis());
//        System.out.println("calculated for (" + timestamp4 + " - " + timestamp3 + ") seconds");
//
//        Timestamp timestamp5 = new Timestamp(System.currentTimeMillis());
//        obj.calculateClimbStairs(91);
//        Timestamp timestamp6 = new Timestamp(System.currentTimeMillis());
//        System.out.println("calculated for (" + timestamp6 + " - " + timestamp5 + ") seconds");
    }

    public void calculateNums(int [] array){
        Nums calc = new Nums();
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(" , ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]");
        boolean result = calc.polindroms(array);
        System.out.println(" is palindrom: " + result);
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

    public void twoSum(int [] inputArr,int target){
        TwoSum calc = new TwoSum();
        System.out.print("Indexes for array \n[");
        calc.twoSum(inputArr, target);
        for(int i = 0; i < inputArr.length;i++) {
           System.out.print(inputArr[i]);
           if(i < inputArr.length - 1)
               System.out.print(", ");
        }
        System.out.println(" ]");
        int [] res = calc.twoSum(inputArr, target);

        System.out.print("and target " + target + " is: \n[");

        for(int i = 0; i < res.length;i++) {
            System.out.print(res[i]);
            if(i < res.length - 1)
                System.out.print(", ");
        }
        System.out.print(" ]\n");



    }
}
