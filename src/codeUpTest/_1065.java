package codeUpTest;
// 짝수만 출력
import java.util.Scanner;

public class _1065 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int a = sn.nextInt();
    int b = sn.nextInt();
    int c = sn.nextInt();

    if(a%2==0)
    {
      System.out.printf("%d \n", a);
    }

    if(b%2==0)
    {
      System.out.printf("%d \n", b);
    }

    if(c%2==0)
    {
      System.out.printf("%d", c);
    }


  }
}