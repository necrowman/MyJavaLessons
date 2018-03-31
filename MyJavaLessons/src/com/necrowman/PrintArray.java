package com.necrowman;

public class PrintArray {
    public static void printArray(int [] inputArr) {
        System.out.print("[");
        for (int i = 0; i < inputArr.length; i++) {
            if (i != 0) {
                System.out.print(" , ");
            }
            System.out.print(inputArr[i]);
        }
        System.out.println("]");
    }
}
