package com.necrowman;


public class Main {

    public static void main(String[] args) {
        FibonachiClass obj = new FibonachiClass();
        System.out.println("Fibonachi (-7) is: " + obj.fibonachi(-7));
        System.out.println("Fibonachi (0) is: " + obj.fibonachi(0));
        System.out.println("Fibonachi (1) is: " + obj.fibonachi(1));
        System.out.println("Fibonachi (2) is: " + obj.fibonachi(2));
        System.out.println("Fibonachi (3) is: " + obj.fibonachi(3));
        System.out.println("Fibonachi (5) is: " + obj.fibonachi(5));
        System.out.println("Fibonachi (7) is: " + obj.fibonachi(7));
        System.out.println("Fibonachi (10) is: " + obj.fibonachi(10));
        System.out.println("Fibonachi (45) is: " + obj.fibonachi(45));
    }
}
