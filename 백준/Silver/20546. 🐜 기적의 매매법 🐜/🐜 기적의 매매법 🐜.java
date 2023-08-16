import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        int[] arr = new int[14];

        for (int i = 0; i < 14; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int bnpScore = bnp(arr, cash);
        int timingScore = timing(arr, cash);

        if (bnpScore > timingScore) {
            System.out.println("BNP");
        } else if (timingScore > bnpScore) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }

    public static int bnp(int[] arr, int cash) {
        int count = 0;
        for (int i = 0; i < 14; i++) {
            if (cash < arr[i]) {
                continue;
            }
            count += cash / arr[i];
            cash -= arr[i] * count;
        }
        return arr[13] * count + cash;
    }

    public static int timing(int[] arr, int cash) {
        int count = 0;
        int upCount = 0;
        int downCount = 0;
        for (int i = 1; i < 14; i++) {
            if (arr[i] > arr[i - 1]) {
                upCount++;
                downCount = 0;
            } else if (arr[i] < arr[i - 1]) {
                downCount++;
                upCount = 0;
            }
            if (upCount >= 3) {
                if (count != 0) {
                    cash += count * arr[i];
                    count = 0;
                }
            }
            if (downCount >= 3) {
                count += cash / arr[i];
                cash %= arr[i];
            }
        }
        return arr[13] * count + cash;
    }
}