package Á¤·Ä;

import java.util.Arrays;
import java.util.Scanner;

public class Back2750 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int iterNum = sc.nextInt();
		int[] arr = new int[iterNum];
		
		for (int i = 0; i < iterNum; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
