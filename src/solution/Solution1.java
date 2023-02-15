package solution;

public class Solution1 {
    public double percent(double p1, double p2) {
        double answer = p1 / p2 * 100;
        return answer;
    }
    public int solution(int[][] lotteries) {
        int answer = 0;




        return answer;
    }
    public static void main(String[] args) {
        Solution1 T = new Solution1();
        double[][] arr = {{100,100,500},{1000,1000,100}};
                
        double a = arr[1][0] / (arr[1][1]+1) * 100;
        System.out.println("a = " + a);
        
        double p = (double) 1000 / (double)1001 * 100;
        double p1 = (double) 100 / (double)101 * 100;
        if (p > p1) System.out.println(String.format("%.2f",p));
        else System.out.println(String.format("%.2f",p1));
    }
}
