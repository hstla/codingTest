package backJoon;

import java.io.*;
import java.util.*;

class Lomin_배열합치기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];

		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++){
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		Map<Integer, Integer> count = new HashMap<>();

		for(int num : arr1) count.put(num, count.getOrDefault(num, 0) + 1);
		for(int num : arr2) count.put(num, count.getOrDefault(num, 0) + 1);

		List<Integer> list = new ArrayList<>();

		for(int key : count.keySet()) {
			if(count.get(key) == 1) list.add(key);
		}

		Collections.sort(list);

		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}