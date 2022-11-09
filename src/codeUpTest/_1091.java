package codeUpTest;

import java.util.Scanner;

public class _1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();
        long sum = a;
        for (int i = 1; i < n; i++) {
            sum *= m;
            sum += d;
        }
        System.out.println(sum);
    }
}