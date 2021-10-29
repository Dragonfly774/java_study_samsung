package com.company;

import java.util.Arrays;


public class Main5 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        int i, j;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.println(arr[i][j]);
            }

        }
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
    }


    public static void print(int[][] v) {
        System.out.print("Python is better " + Arrays.toString(v));
    }
}
