package ±ÔÄ¢;

import java.util.Scanner;

public class Back2292_re {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int p = 1;
		int q = 1;
		int tmp = 1;
		int ea = 0;

		name: while (true) {
			
			for (int i = p; i <= q; i++) {
				
				if (n == i) {
					ea++;
					break name;
				}
				
				if (i == q) {
					ea++;
				}
			}
			
			p = q+1;
			q += 6*tmp;
			tmp++;
		}
		
		System.out.println(ea);
		
	}
}
