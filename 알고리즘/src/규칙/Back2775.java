package ±ÔÄ¢;

import java.util.Arrays;
import java.util.Scanner;

public class Back2775 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int testCase = sc.nextInt();
		int k = 1;
		int n = 3;
		
		for (int p = 0; p < testCase; p++) {
			k = sc.nextInt();
			n = sc.nextInt();
			int[] ea = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
			System.out.println(n +"," + k);
			
			int[] tmp = new int[14];
			
			for (int i = 0; i < k; i++) {
				
				for (int j = 0; j < n; j++) {
					tmp[j] = recursionSum(j, ea);
				}
				
				System.arraycopy(tmp, 0, ea, 0, n);
			}
			
			System.out.println(ea[n-1]);
		}
		
	}
	
	public static int recursionSum(int num, int[] ea) {
		if (num == 0) {
			return ea[0];
		}
		return ea[num] + recursionSum(num - 1, ea);
	}
}
