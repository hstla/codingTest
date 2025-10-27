package backJoon;

import java.io.*;
import java.util.*;

class Lomin_선물상자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int ans = 0;
		int max = Integer.MIN_VALUE;

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];

		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		for(int i = 0; i<k;i++) {
			ans += arr[n-1-i];
			max = Math.max(ans, max);
		}

		System.out.println(max);
	}
}