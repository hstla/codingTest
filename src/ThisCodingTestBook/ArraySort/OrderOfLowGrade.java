package ThisCodingTestBook.ArraySort;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class OrderOfLowGrade {
    public static String[] solution(int n, Map<String, Integer> dict) {
        String[] answer = new String[n];

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> dict = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            Integer score = sc.nextInt();
            dict.put(name, score);
        }

        for (String s : solution(n,dict)) System.out.println(s);

        System.out.println(dict.get("이순신"));
    }
}

