package 백준문제;

import java.util.Scanner;

public class Back2439 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
