package com.necrowman;

public class Nums {
    public boolean polindroms(int [] array) {
        int count = array.length;
        int halfIndex = count / 2;
        for (int i = 0; i < halfIndex; i++) {
            if (array[i] != array[count - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
