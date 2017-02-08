package com.company;

public class MergeSort {

    private int[] numbers;
    private int[] helper;
    private int size;

    public void sort(int[] number){
        this.numbers = number;
        this.size = number.length;
        this.helper = new int[size];
        mergeSort(0, size - 1);
    }

    private void mergeSort(int lowIndex, int highIndex){
        if(lowIndex<highIndex){
            int meddian = lowIndex + (highIndex - lowIndex)/2;
            mergeSort(lowIndex, meddian);
            mergeSort(meddian+1, highIndex);
            merge(lowIndex, meddian, highIndex);
        }
    }

    private void merge(int lowIndex, int meddian, int highIndex) {

        for (int i = lowIndex; i <= highIndex; i++){
            helper[i] = numbers[i];
        }

        int i  =  lowIndex;
        int j = meddian + 1;
        int k = lowIndex;
        while (i <= meddian && j <= highIndex){
            if(helper[i] <= helper[j]){
                numbers[k] = helper[i];
                i++;
            }else {
                numbers[k] =  helper[j];
                j++;
            }
            k++;
        }
        while (i<=meddian){
            numbers[k] = helper[i];
            k++;
            i++;
        }
    }

}



