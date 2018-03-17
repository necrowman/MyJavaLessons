package com.necrowman;

public class SqureNumber{
    public long calculateSqNump(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n < 0) {
            return calculateSqNump(-n);
        }
        else {
            long p;
            int n1;
            n1 =  2 * n - 1;
            p = calculateSqNump(n - 1) + n1;
            return p;
        }

    }

}
