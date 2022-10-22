package codeUpTest;
// 함수로 만든 계산기
import java.util.Scanner;

public class _1045 {
  private int sum(int i, int n) {return i + n;}
  private int subtract(int i, int n) {return i - n;}
  private int multiply(int i, int n) {return i * n;}
  private int divide (int i, int n) {return i / n;}
  private int remainder (int i, int n) {return i % n;}
  private float redivde (float i, float n) {return i / n;}
  public static void main(String[] args) {
    _1045 T = new _1045();
    Scanner sn = new Scanner(System.in);
    int i = sn.nextInt();
    int n = sn.nextInt();

    System.out.println(T.sum(i, n));
    System.out.println(T.subtract(i, n));
    System.out.println(T.multiply(i, n));
    System.out.println(T.divide(i, n));
    System.out.println(T.remainder(i, n));
    System.out.printf("%.2f",T.redivde(i, n));
  }
}
