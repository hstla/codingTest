package codeUpTest;
// 연속된 case문 java17 에서는 case를 하나만 써도 되는데
// java11에서는 안됨
import java.util.Scanner;

public class _1070 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int a = sn.nextInt();
    switch(a){
//      case 12,1,2:
//        System.out.println("winter");
//        break;
      case 12: case 1: case 2:
        System.out.println("winter");
        break;
      case 3: case 4: case 5:
        System.out.println("spring");
        break;
      case 6: case 7: case 8:
        System.out.println("summer");
        break;
      case 9: case 10: case 11:
        System.out.println("fall");
        break;
    }
  }
}