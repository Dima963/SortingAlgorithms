package com.company;

public class BubbleSort {
    public static int[] sort(int[] number){

        for(int i  =  number.length - 1; i >= 0; i--){
            for(int j = 0; j<i; j++){
                if(number[j] >= number[j+1]){
                    int temp =  number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        return number;
    }
}
