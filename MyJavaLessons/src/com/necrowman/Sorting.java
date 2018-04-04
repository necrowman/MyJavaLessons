package com.necrowman;

public class Sorting {

    public int[] boobleSorting(int [] inputArr,boolean isAsceding){
        int [] res = inputArr;
        int globalP = 0;
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
            globalP += p;
            if(p == 0){
                System.out.println(globalP);
                return res;
            }
        }
        System.out.println(globalP);
        return res;
    }

    public int[] viborkaSorting(int [] inputArr,boolean isAsceding){
        int [] res = inputArr;
        int p = 0;
        for(int i = 0; i < res.length - 2; i++){
            int extremum = res[i];
            int index = i;
            for (int j = i + 1; j < inputArr.length; j++){
                if (res[j] < extremum && isAsceding ||
                        res[j] > extremum && !isAsceding) {
                    extremum = res[j];
                    index = j;
                }
            }
            if (index != i) {
                res[index] = res[i];
                res[i] = extremum;
                p++;
            }
        }
        System.out.println(p);
        return res;
    }

}
