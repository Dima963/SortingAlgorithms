package com.company;

public class GnomSort {
    public static int[] sort(int[] number){
        int i = 1;
        while (i<number.length){
            if(i==0||number[i-1]<=number[i]){
                i++;
            }else {
                int temp = number[i];
                number[i] = number[i-1];
                number[i-1] = temp;
                i--;
            }
        }

        return number;
    }
}
