package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws IOException {
        Scanner INPUT=new Scanner(System.in);

        int[] unsortedArray = fileIO.readFile("src/unsorted.txt");

        int[] sortedArray=sort.sort(unsortedArray);

        fileIO.writeFile("src/sorted.txt",sortedArray);

        System.out.print("Number you want to be found?\n>");
        System.out.println("Index: "+sort.linearSearch(sortedArray,INPUT.nextInt()));


    }
}
