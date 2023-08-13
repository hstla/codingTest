import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int[] arr = new int[10];
        int tmp = 0;
        int max = Integer.MIN_VALUE;

        while (inputNumber != 0) {
            tmp = inputNumber % 10;
            inputNumber /= 10;
            arr[tmp] += 1;
        }
        int sum = arr[6] + arr[9];
        if (sum % 2 == 1) {
            arr[6] = sum / 2 + 1;
            arr[9] = sum / 2 + 1;
        } else {
            arr[6] = sum / 2;
            arr[9] = sum / 2;
        }

//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        for (int i = 0; i < 10; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);

    }
}