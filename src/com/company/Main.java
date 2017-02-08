package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random =  new Random();

        int[] Arr = new int [10];

        for (int i = 0; i < 10; i++){
            Arr[i] = random.nextInt(10);
            System.out.print(Arr[i] + " ");
        }

        System.out.println(" ");

        MergeSort mergeSort =  new MergeSort();
        mergeSort.sort(Arr);
        for(int i:Arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
