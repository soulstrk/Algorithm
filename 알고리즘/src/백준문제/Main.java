package 백준문제;

import java.util.Scanner;

public class Main {

private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int testCase = sc.nextInt();
		int k = 1;
		int n = 3;
		String[] result = new String[testCase];
		
		for (int p = 0; p < testCase; p++) {
			k = sc.nextInt();
			n = sc.nextInt();
			int[] ea = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
			int[] tmp = new int[14];
			
			for (int i = 0; i < k; i++) {
				
				for (int j = 0; j < n; j++) {
					tmp[j] = recursionSum(j, ea);
				}
				
				System.arraycopy(tmp, 0, ea, 0, n);
			}
			
			result[p] = String.valueOf(ea[n-1]);
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public static int recursionSum(int num, int[] ea) {
		if (num == 0) {
			return ea[0];
		}
		return ea[num] + recursionSum(num - 1, ea);
	}
}
