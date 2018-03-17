package com.necrowman;

public class FibonachiClass{
    public long fibonachi(int f){
        if(f < 0) {
            return 0;
        }
        else if(f <= 1){
            return 1;
        }
        else {
            int f1 = f - 1;
            int f2 = f - 2;
            long fib1 = fibonachi(f1);
            long fib2 = fibonachi(f2);
            return fib1 + fib2;
        }
    }
}
