import java.util.*;

public class Main {
    public static int n, m;
    public static int answer;
    public static StringBuilder ansStr = new StringBuilder();
    public static String[] arr;
    public static char[] dna = {'A', 'C', 'G', 'T'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        for (int j = 0; j < m; j++) {
            int[] count = new int[4];
            for (int i = 0; i < n; i++) {
                char c = arr[i].charAt(j);
                switch (c) {
                    case 'A': count[0]++; break;
                    case 'C': count[1]++; break;
                    case 'G': count[2]++; break;
                    case 'T': count[3]++; break;
                }
            }
            int maxIdx = 0;
            for (int i = 1; i < 4; i++) {
                if (count[i] > count[maxIdx]) {
                    maxIdx = i;
                }
            }
            ansStr.append(dna[maxIdx]);
            answer += n - count[maxIdx];
        }
        System.out.println(ansStr);
        System.out.println(answer);
    }
}
