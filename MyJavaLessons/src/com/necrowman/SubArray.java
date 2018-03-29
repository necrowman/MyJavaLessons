package com.necrowman;

import java.util.Arrays;

public class SubArray{
    static int[] addElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    public int [] subArray(int [] inputArr, int start, int end){
        if(end < start || end < 0 || start >= inputArr.length) {
            return new int []{};
        }
        int [] res = new int [] {};
        int startIndex = (start < 0) ? 0 : start;
        int endIndex = (end > inputArr.length) ? inputArr.length : end;
        for(int i = startIndex; i < endIndex; i++){
            res = SubArray.addElement(res, inputArr[i]);
        }
        return res;
    }

}
