
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10001];
        for (int i = 0; i < 10000; i++) {
            int k = add(i);
            if (k < 10001) {
                arr[k] = 1;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }
    }

    public static int add(int num) {
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
