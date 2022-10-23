package codeUpTest;
// 짝수, 홀수 출력
import java.util.Scanner;

public class _1066 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int a = sn.nextInt();
    int b = sn.nextInt();
    int c = sn.nextInt();

    if(a%2==0) System.out.printf("even \n");
    else System.out.printf("odd \n");

    if(b%2==0) System.out.printf("even \n");
    else System.out.printf("odd \n");

    if(c%2==0) System.out.printf("even \n");
    else System.out.printf("odd \n");
  }
}