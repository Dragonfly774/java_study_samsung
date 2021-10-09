package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] mas  = new int[a];
        mas[0] = 0;
        mas[1] = 1;
        for (int b = 2; b < a; b++) {
            mas[b] = mas[b - 1] + mas[b - 2];
        }
        print(mas);
    }
    public static void print(int[] v) {
        System.out.println("Никита лох  " + Arrays.toString(v));
    }
}
