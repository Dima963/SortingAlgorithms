package com.company;

public class GnomSort {

    public static int[] sort(int[] numbers){

        int i = 1;
        while (i<numbers.length){
            if(i==0||numbers[i-1] <= numbers[i]){
                i++;
            }else{
                int temp = numbers[i];
                numbers[i] = numbers[i-1];
                numbers[i-1] = temp;
                i--;
            }
        }

        return numbers;
    }
}
