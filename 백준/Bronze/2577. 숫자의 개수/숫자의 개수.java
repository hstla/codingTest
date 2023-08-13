import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = 1;
        int[] arr = new int[10];
        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            mul *= num;
        }
        int tmp = 0;
        while (mul != 0) {
            tmp = mul % 10;
            mul = mul / 10;
            arr[tmp] += 1;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}