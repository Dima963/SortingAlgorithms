package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random =  new Random();

        int[] Arr = new int [14];
        int[] ArrGnom = new int [14];
        int[] ArrMerge = new int [14];
        int[] ArrBubble = new int [14];
        int[] ArrQuick =  new int[14];
        int[] ArrInsert =  new int[14];
        int[] ArrShell =  new int[14];



        System.out.println("Initial array");
        for (int i = 0; i < 14; i++){
            Arr[i] = random.nextInt(14);
            ArrGnom[i] = random.nextInt(14);
            ArrMerge[i] = random.nextInt(14);
            ArrBubble[i] = random.nextInt(14);
            ArrQuick[i] = random.nextInt(14);
            ArrInsert[i] = random.nextInt(14);
            ArrShell[i] =  random.nextInt(14);

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
       mergeSort.sort(ArrMerge);
         for(int i:ArrMerge){
            System.out.print(i);
            System.out.print(" ");
         }

        System.out.println(" ");
        System.out.println("Bubble Sort:");
        int[] Bubble =  BubbleSort.sort(ArrBubble);
        for (int i = 0; i<Bubble.length; i++){
            System.out.print(Bubble[i]+" " );
        }


        System.out.println(" ");
        System.out.println("Gnom Sort:");
        int[] Gnome =  GnomSort.sort(ArrGnom);
        for (int i = 0; i<Gnome.length; i++){
            System.out.print(Gnome[i]+" " );
        }

        System.out.println(" ");
        System.out.println("Quick Sort:");

        QuickSort quickSort =  new QuickSort();
        quickSort.sort(ArrQuick);
        for(int i:ArrQuick){
            System.out.print(i);
            System.out.print(" ");
        }



        System.out.println(" ");
        System.out.println("Insert Sort:");
        int[] Insert =  InsertionSort.sort(ArrInsert);
        for (int i = 0; i<Insert.length; i++){
            System.out.print(Insert[i]+" " );
        }

        System.out.println(" ");
        System.out.println("Shell Sort:");
        int[] Shell =  ShellSort.sort(ArrShell);
        for (int i = 0; i<Shell.length; i++){
            System.out.print(Shell[i]+" " );
        }



    }
}
