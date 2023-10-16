import java.util.*;

class Main {

    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (int i : solution(n, arr)) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
//        System.out.println(solution(m, arr));
    }
}
