package codeUpTest;

import java.util.Scanner;

public class _1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int day = 1;
        while (day % a != 0 || day % m != 0 || day % d != 0) day++;
        System.out.println(day);
    }
}