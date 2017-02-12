package com.company;

public class InsertionSort {
    public static int[] sort(int[] number){
        for (int i = 1; i<number.length; i++){
            int temp = number[i];
            int j = i-1;
            while (j>=0 && number[j]>temp){
                number[j+1] = number[j];
                j=j-1;
            }
            number[j+1] = temp;
        }
        return  number;
    }

}
