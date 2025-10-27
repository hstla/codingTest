package backJoon;

import java.io.*;
import java.util.*;

class Lomin_짝수팰린드롬 {
	static boolean isPalindroms(String s) {
		int n = s.length();
		for(int i =0;i<n/2;i++) {
			if(s.charAt(i) != s.charAt(n-i-1)) return false;
		}
		return true;
	}

	static int countPalindromes(String s) {
		int n = s.length();
		if (n % 2 != 0) return 0;
		if(!isPalindroms(s)) return 0;

		int count = 1;

		String left = s.substring(0, n / 2);
		String right = s.substring(n / 2);
		count += countPalindromes(left);
		count += countPalindromes(right);
		return count;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();

		System.out.println(countPalindromes(str));
	}
}