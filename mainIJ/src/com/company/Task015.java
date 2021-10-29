package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Task015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        float s = 0;
        float x = scan.nextFloat();
        int n = scan.nextInt();
        int i;
        s = n + x;
        for (i = n - 1; i > 0; i--){
            s = i + x / s;
        }
        System.out.println(s);
    }
}
