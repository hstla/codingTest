import java.util.*;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int answer = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            int temp = seats[i] - students[i];
            answer += Math.abs(temp);
        }
        return answer;       
    }
}