package ThisCodingTestBook._7BinarySearch;

public class _8MakingRiceCake {
    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        int start = 0;
        int end = (int) 1e9;
        while ( start <= end) {
            long total =0;
            int mid = (start + end) /2;
            for (int i =0;i<n;i++) {
                if (arr[i] > mid) total += arr[i] - mid;
            }
            if (total < m) end = mid - 1;
            else {
                answer = mid;
                start = mid +1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int[] arr = {19,15,10,17};
        System.out.println(solution(n,m,arr));
    }
}
