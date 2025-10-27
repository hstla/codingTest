package backJoon;

import java.io.*;
import java.util.*;

class Lomin_하늘다리 {
	static class Pair {
		int height, index;
		Pair(int h, int i) {height = h; index = i;}
	}


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i =0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Stack<Pair> stack = new Stack<>();
		int count = 0;

		for(int i =0;i<n;i++) {
			while(!stack.isEmpty() && stack.peek().height < arr[i]) {
				stack.pop();
			}
			if(!stack.isEmpty() && stack.peek().height == arr[i]) {
				count++;
			}
			stack.push(new Pair(arr[i], i));
		}

		System.out.println(count);
	}
}