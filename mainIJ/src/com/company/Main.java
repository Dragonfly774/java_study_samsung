package com.company;

//import java.util.Locale;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// scan.useLocale(Locale.US);
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\com\\company\\text");
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(new File("out.txt"));
//        PrintWriter pw = new PrintWriter(System.out);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
//            System.out.println(">");
            pw.println(">");
        } else {
            if (a < b) {
//                System.out.println("<");
                pw.println("<");
            } else {
                pw.println("=");
//                System.out.println("=");
            }
        }
        pw.flush();
        pw.close();
    }
}
