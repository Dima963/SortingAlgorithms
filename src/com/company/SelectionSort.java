package com.company;

public class SelectionSort {
    static int[] sort(int[] numbers){
        for(int i = 0; i<numbers.length; i++){
            int minNumberIndex = i;
            for(int j  = i+1; j < numbers.length; j++ ){
                if(numbers[j] < numbers[minNumberIndex]){
                    minNumberIndex = j;
                }
            }
            int temp =  numbers[minNumberIndex];
            numbers[minNumberIndex] =  numbers[i];
            numbers[i] =  temp;
        }

        return numbers;
    }
}
