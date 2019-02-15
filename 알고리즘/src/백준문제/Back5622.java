package 백준문제;

import java.util.Scanner;

public class Back5622 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int time = 0;
		String inputStr = sc.next();
		
		inputStr = inputStr.toUpperCase();
		String dialNumber = transToNumber(inputStr);
		
		for (int i = 0; i < dialNumber.length(); i++) {
			time += Integer.parseInt(dialNumber.charAt(i)+"") + 1;
		}
		
		System.out.println(time);
	}

	private static String transToNumber(String inputStr) {
		String[] mappingArray = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"}; //2~9
		String dialNumber = "";
		
		for (int i = 0; i < inputStr.length(); i++) {
			
			char findStr = inputStr.charAt(i);
			
			for (int j = 0; j < mappingArray.length; j++) {
				
				if (mappingArray[j].indexOf(findStr) > -1) {
					dialNumber += j + 2;
					break;
				}
			}
		}
		
		return dialNumber;
	}
}
