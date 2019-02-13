package 백준문제;

import java.util.Scanner;

public class Back1065 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n 		= sc.nextInt();
		int[] arr 	= new int[3];
		int sum 	= 0;
		
		if (n < 1 || n > 1000) {
			return;
		}
		
		if (n < 100) {
			System.out.println("99");
			return;
		}
		
		sum = 99;
		
		for (int i = 100; i <= n; i++) {
			
			arr[0] = i/100; // 1
			arr[1] = i/10 - arr[0]*10; // 2
			if(i == 123) {
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(i);
			}
			arr[2] = i - (arr[0]*100) + (arr[1]*10); // 3
			if(i == 123) {
				System.out.println(arr[2]);
			}
			
			
			if (arr[0] - arr[1] == arr[1] - arr[2]) {
				sum ++;
			}
		}
		
		
	}
}
