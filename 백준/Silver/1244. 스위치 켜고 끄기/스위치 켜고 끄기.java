import java.util.Scanner;

public class Main {

    public static int[] light;
    public static int[][] student;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        light = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            light[i] = sc.nextInt();
        }
        int studentNumber = sc.nextInt();
        student = new int[studentNumber][2];
        for (int i = 0; i < studentNumber; i++) {
            for (int j = 0; j < 2; j++) {
                student[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < studentNumber; i++) {
            if (student[i][0] == 1) {
                men(i);
            } else {
                women(i);
            }
        }

        int q = 1;
        int w = 0;
        while (q < light.length) {
            System.out.print(light[q++] + " ");
            w++;
            if (w == 20) {
                System.out.println();
                w = 0;
            }
        }

    }

    public static void change(int i) {
        if (light[i] == 1) {
            light[i] = 0;
        } else {
            light[i] = 1;
        }
    }

    public static void men(int i) {
        int num = student[i][1];
        for (int j = num; j < light.length; j++) {
            if (j % num == 0) {
                change(j);
            }
        }
    }

    private static void women(int i) {
        int num = student[i][1];
        change(num);
        int n = 1;
        while ((num - n) > 0 && (num + n) < light.length) {
            if (light[num - n] == light[num + n]) {
                change(num - n);
                change(num + n);
                n++;
            } else {
                break;
            }
        }
    }
}