package com.company;
import java.util.Scanner;


public class Dz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println((i & (i - 1)));
    }
}

// 1
//public class Dz {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//        int i = scanner.nextInt();
//        System.out.println(i != 0 ? A & - (1 << i) : A);
//    }
//}

//2
//import java.util.Scanner;
//
//public class Dz {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        System.out.println(1 << i);
//    }
//}


//5
//import java.util.Scanner;
//
//public class Solve {
//
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int a = in.nextInt();
//        int i = in.nextInt();
//
//        System.out.println(a % (1 << i));
//    }
//}

//6
//import java.util.Scanner;
//
//public class Solve {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        System.out.println((n & (n - 1)));
//    }
//}
//git branch -M main
//git remote add origin https://github.com/Dragonfly774/java_study_samsung.git
//git push -u origin main