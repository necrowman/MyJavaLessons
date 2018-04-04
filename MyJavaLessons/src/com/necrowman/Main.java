package com.necrowman;
import java.sql.Timestamp;
import java.security.cert.CertPath;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println("Buble Sorting:");
        obj.boobleSortingOfArray(new int [] {1, 3, 6, 4, 1, 6, 8, 5, 12, 12,34,21,345,12,55,35,68,35,75,422,345,67,80,
                123,45,67},true);
        obj.boobleSortingOfArray(new int [] {},true);
        obj.boobleSortingOfArray(new int [] {98,87,76,65,54,43,32,21, 10, 9,7,4,1},true);
        obj.boobleSortingOfArray(new int [] {1, 3, 6, 4, 1, 6, 8, 5, 12, 12,34,21,345,12,55,35,68,35,75,422,345,67,80,
                123,45,67},false);
        obj.boobleSortingOfArray(new int [] {},false);
        obj.boobleSortingOfArray(new int [] {98,87,76,65,54,43,32,21, 10, 9,7,4,1},false);

        System.out.println("Vybirka Sorting:");
        obj.viborkaSortingOfArray(new int [] {1, 3, 6, 4, 1, 6, 8, 5, 12, 12,34,21,345,12,55,35,68,35,75,422,345,67,80,
                123,45,67},true);
        obj.viborkaSortingOfArray(new int [] {},true);
        obj.viborkaSortingOfArray(new int [] {98,87,76,65,54,43,32,21, 10, 9,7,4,1},true);
        obj.viborkaSortingOfArray(new int [] {1, 3, 6, 4, 1, 6, 8, 5, 12, 12,34,21,345,12,55,35,68,35,75,422,345,67,80,
                123,45,67},false);
        obj.viborkaSortingOfArray(new int [] {},false);
        obj.viborkaSortingOfArray(new int [] {98,87,76,65,54,43,32,21, 10, 9,7,4,1},false);

    }

    public void viborkaSortingOfArray(int [] arr, boolean asc){
        PrintArray.printArray(arr);
        Sorting c = new Sorting();
        int [] res = c.viborkaSorting(arr,asc);
        PrintArray.printArray(res);

    }

    public void calculateSubArray(int [] inputArr, int start, int end){
        SubArray calc = new SubArray();
        PrintArray.printArray(inputArr);
        int [] result = calc.subArray(inputArr, start, end);
        PrintArray.printArray(result);
    }
    public void calculateMergeArray(int [] arr1, int n, int [] arr2, int m){
        MergeArray calc = new MergeArray();
        System.out.println("Arr1 :");
        PrintArray.printArray(arr1);
        System.out.println("Arr2 :");
        PrintArray.printArray(arr2);
        int [] res = calc.mergeArrays(arr1, n, arr2, m);
        System.out.println("Result :");
        PrintArray.printArray(res);

    }
    public void boobleSortingOfArray(int [] arr, boolean asc){
        PrintArray.printArray(arr);
        Sorting c = new Sorting();
        int [] res = c.boobleSorting(arr,asc);
        PrintArray.printArray(res);

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
