package ±ÔÄ¢;

import java.util.Scanner;

public class Back10250 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int testCase = sc.nextInt();
		int H = 0;
		int W = 0;
		int N = 0;

		for (int i = 0; i < testCase; i++) {
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();
			
			hwn(H, W, N);
		}
	}

	public static void hwn(int H, int W, int N) {
		System.out.println(W);
		int nn = 0;
		String result = "";
		
		int[][] arr = new int[H][W];

		out: for (int i = 0; i < arr[0].length; i++) {

			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = 1;
				nn++;

				if (nn == N) {
					result = (j + 1) + "0" + (i + 1);
					break out;
				}
			}
		}
		
		System.out.println(result);
	}
}
