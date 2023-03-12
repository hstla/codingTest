package ThisCodingTestBook._11PreviousProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int math;

    @Override
    public int compareTo(Student other) {
        if (this.kor == other.kor && this.eng == other.eng && this.math == other.math) {
            return this.name.compareTo(other.name);
        }
        // 증가하는 순서
        if (this.kor == other.kor && this.eng == other.eng) {
            return Integer.compare(other.math, this.math);
        }
        // 감소하는 순서
        if (this.kor == other.kor) {
            return Integer.compare(this.eng, other.eng);
        }
        return Integer.compare(other.kor, this.kor);
    }

    public String getName() {
        return name;
    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class KorEngMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students.add(new Student(name, kor, eng, math));
        }
        Collections.sort(students);
        for (int i = 0; i < n; i++) System.out.println(students.get(i).getName());
    }
}