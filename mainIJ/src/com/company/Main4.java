package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int b = 0; b < a; b++) {
            int d = scanner.nextInt();
            if (d < 0) {
                break;
            }
            switch (d) {
                case 1 -> print("Понедельник");
                case 2 -> print("Вторник");
                case 3 -> print("Среда");
                case 4 -> print("Четверг");
                case 5 -> print("Пятница");
                case 6 -> print("Суббота");
                case 7 -> print("Воскресенье");
            }
        }

    }
    public static void print(String v) {
        System.out.println("Никита лох  " + v);
    }
}
