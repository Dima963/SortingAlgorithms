package com.company;

public class QuickSort {

    private int[] number;
    private int size;

    public void sort(int[] number){
        this.number = number;
        this.size = number.length;
        quickSort(0, size - 1);


    }

    private void quickSort(int lowInndex, int highInde) {
        if(lowInndex >= highInde){
            return;
        }
        int middle =  lowInndex +(highInde - lowInndex)/2;
        int i =  lowInndex;
        int j = highInde;
        while (i < j) {
            while (i < middle && (number[i] <= number[middle])) {
                i++;
            }
            while (j > middle && (number[middle] <= number[j])) {
                j--;
            }
            if (i < j) {
                int temp = number[i];
                number[i] = number[j];
                number[j] = temp;
                if (i == middle)
                    middle = j;
                else if (j == middle)
                    middle = i;
            }
        }
        quickSort(lowInndex, middle);
        quickSort(middle+1, highInde);
    }


}


