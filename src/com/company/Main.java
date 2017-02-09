package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random =  new Random();

        int[] Arr = new int [30];

        System.out.println("Initial array");
        for (int i = 0; i < 30; i++){
            Arr[i] = random.nextInt(30);
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" ");

        int[] ArrSelection =  SelectionSort.sort(Arr);
        System.out.println("Selection Sort:");
        for (int i = 0; i < ArrSelection.length; i++){
            System.out.print(ArrSelection[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Merge Sort:");

       MergeSort mergeSort =  new MergeSort();
       mergeSort.sort(Arr);
         for(int i:Arr){
            System.out.print(i);
            System.out.print(" ");
         }

        System.out.println(" ");
        System.out.println("Bubble Sort:");
        int[] Bubble =  BubbleSort.sort(Arr);
        for (int i = 0; i<Bubble.length; i++){
            System.out.print(Bubble[i]+" " );
        }


        System.out.println(" ");
        System.out.println("Gnom Sort:");
        int[] Gnome =  GnomSort.sort(Arr);
        for (int i = 0; i<Gnome.length; i++){
            System.out.print(Gnome[i]+" " );
        }

    }
}
