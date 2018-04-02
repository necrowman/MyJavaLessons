package com.necrowman;

public class Sorting {

    public int[] boobleSorting(int [] inputArr,boolean isAsceding){
        int [] res = inputArr;
        for(int j = inputArr.length - 1; j > 0; j--){
            int p = 0;
            for(int i = 0; i < j; i++){
                if(isAsceding && inputArr[i] > inputArr[i + 1] ||
                        !isAsceding && inputArr[i] < inputArr[i + 1]){
                    inputArr[i] += inputArr[i + 1];
                    inputArr[i+1] = inputArr[i] - inputArr[i + 1];
                    inputArr[i] = inputArr[i] - inputArr[i + 1];
                    p++;
                }
            }
            System.out.println(p);
            if(p == 0){
                return res;
            }
        }
        return res;
    }

}
