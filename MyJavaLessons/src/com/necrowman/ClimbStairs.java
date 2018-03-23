package com.necrowman;
import java.util.Arrays;

public class ClimbStairs {// extends FibonachiClass{

    private long[] fibNumbers = {1, 1};

    public long climbStairs(int p){

        if (fibNumbers.length > p) {
            return fibNumbers[p];
        } else {
            for (int i = fibNumbers.length - 1; i < p; i++) {
                long el = fibNumbers[i - 1] + fibNumbers[i];
                fibNumbers = ClimbStairs.addElement(fibNumbers, el);
            }
            return fibNumbers[p];
        }
    }

    static long[] addElement(long[] a, long e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
}
