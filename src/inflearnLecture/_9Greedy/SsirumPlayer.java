package inflearnLecture._9Greedy;

import java.util.*;

/*
씨름 선수
input
5
172 67
183 65
180 70
170 72
181 60

output
3
 */
class Point implements Comparable<Point> {
    int height;
    int weight;

    public Point(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Point other) {
        return other.height - this.height;
    }

    @Override
    public String toString() {
        return "Point{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}

public class SsirumPlayer {
    public static int solution(int n, ArrayList<Point> arr) {
        int answer = 0;
        int maxWeight = Integer.MIN_VALUE;
        for (Point p : arr) {
            if (p.weight > maxWeight) {
                maxWeight = p.weight;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int height = in.nextInt();
            int weight = in.nextInt();
            arr.add(new Point(height, weight));
        }
        Collections.sort(arr);
//        for (Point p : arr) System.out.println(p);
        System.out.println(solution(n, arr));
    }
}
