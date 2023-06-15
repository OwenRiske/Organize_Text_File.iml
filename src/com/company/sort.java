package com.company;

import java.util.Random;

public class sort {

    public static int[] sort(int[] array){
        //for each element in the list
        for (int i = 0; i < array.length; i++) {
            //for each element that is equal to or less then i
            for (int j = i; j > 0 ; j--) {
                //check to see if the element and the one before it are in order
                if (array[j]<array[j-1]){
                    array=swap(array,j,j-1);
                }

            }

        }
        return array;
    }

    public static int linearSearch(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int[] swap(int[] array, int index1, int index2) {
        //preset variable
        int tempNum=array[index1];

        //set inputed variables as each other
        array[index1]=array[index2];
        array[index2]=tempNum;


        return array;
    }


    public static void displayArray(int[] array){
        //display array except last element
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+", ");
        }
        //display last element
        System.out.println(array[array.length-1]);
    }
}
