package com.company;


import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i;
        int max = Integer.MIN_VALUE;
        for (i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (max < arr[i]){
                max = arr[i];
                }
            }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        }
    }

