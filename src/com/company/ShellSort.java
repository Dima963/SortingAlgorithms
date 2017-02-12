package com.company;

public class ShellSort {

    public static int[] sort(int[] number){

        for (int i = number.length/2; i>0; i /= 2){
            for (int j = i;j<number.length; j++ ){
                int temp =  number[j];
                int k;
                for (k = j; k>=i; k-=i){
                    if(temp<number[k-i])
                        number[k] = number[k-i];
                    else
                        break;
                }
                number[k] = temp;
            }
        }
        return number;
    }

}
