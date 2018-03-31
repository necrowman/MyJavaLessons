package com.necrowman;

public class MergeArray{
    int [] mergeArrays(int [] arr1, int inputN, int [] arr2, int inputM){
        int i = 0;
        int j = 0;
        int [] result = new int[] {};
        int n = (inputN > 0) ? inputN : 0;
        int m = (inputM > 0) ? inputM : 0;

        while (i < n && j < m && i < arr1.length && j < arr2.length){
            if(arr2[j] <= arr1[i]){
                result = SubArray.addElement(result,arr2[j]);
                j++;
            }
            else {
                result = SubArray.addElement(result, arr1[i]);
                i++;
            }
        }
        if (i == arr1.length || i == n) {
            while (j < m || j == arr2.length) {
                result = SubArray.addElement(result, arr2[j]);
                j++;
            }
        }
        if(j == arr2.length || j == m) {
            while (i < n || i == arr1.length) {
                result = SubArray.addElement(result, arr1[i]);
                i++;
            }
        }
        return result;
    }
}
