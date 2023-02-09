package ThisCodingTestBook.greedy;
// 최대한 많이 나누기
public class untilItReachesOne {
    public static Integer mySolution(int n, int k) {
        int answer = 0;
        while (n != 1) {
            if (n%k == 0) {
                n/=k;
            }else {
                n -=1;
            }
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        untilItReachesOne T = new untilItReachesOne();
        int n = 25;
        int k = 5;
        System.out.println(T.mySolution(n,k));
    }
}
