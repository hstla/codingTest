import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 97] += 1;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}