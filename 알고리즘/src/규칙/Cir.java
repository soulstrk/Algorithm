package ±ÔÄ¢;

import java.util.Scanner;

public class Cir {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int prev 	= 0;
		int nowNum 	= 0;
		char nowOperator = ' ';
		
		while(true) {
			String tmp = sc.next();
			
			if (tmp.length() > 0 && !tmp.equals("end")) {
				
				try {
					
					if (nowOperator == ' ') {
						prev = Integer.parseInt(tmp);
					} else { 
						nowNum = Integer.parseInt(tmp);
						prev = performCal(nowOperator, nowNum, prev);
					}
				} catch (Exception e) {
					nowOperator = tmp.charAt(0);
				}
			} else if (tmp.equals("end")) {
				System.out.println("prev:" + prev);
				break;
			}
			System.out.println("prev:" + prev);
		}
	}

	private static int performCal(char nowOperator, int nowNum, int prev) {
		int result = 0;
		
		switch (nowOperator) {
			case '+':
				result = prev + nowNum;
				break;
			case '-':
				result = prev - nowNum;
				break;
			case '/':
				result = prev / nowNum;
				break;
			case '*':
				result = prev * nowNum;
				break;
		}
		
		return result;
	}
	
}
