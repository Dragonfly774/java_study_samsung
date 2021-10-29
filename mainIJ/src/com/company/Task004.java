package com.company;

import java.util.Scanner;

public class Task004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println((1 + y) * (2*x + y * y - (x + y) / (y + 1 / (x * x - 4))));

    }
}
