package 백준문제;

import java.util.Scanner;

public class Back2714 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		if (n > 0 && n <= 100000) {
			
			for (int i = 0; i < n; i++) {
				System.out.println(i+1);
			}
		} else {
			System.out.println("입력 오류");
		}
	}

}
