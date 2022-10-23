package codeUpTest;
// 등급 나누기 switch 문 안되는 줄 알았는데 사용가능
import java.util.Scanner;

public class _1069 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    String a = sn.nextLine();
    switch(a){
      case "A":
        System.out.println("best!!!");
        break;
      case "B":
        System.out.println("good!!");
        break;
      case "C":
        System.out.println("run!");
        break;
      case "D":
        System.out.println("slowly~");
        break;
      default:
        System.out.println("what?");
    }
  }
}