package 백준문제;

import java.util.Scanner;

public class Back1157 {
	
public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String word = sc.nextLine();
		
		word = word.toUpperCase();
		char result = findMaxAlpahbet(word);
		
		System.out.println("정답은 : " + result);
	}

	private static char findMaxAlpahbet(String word) {
		int[] eachNumber = new int[26];
		
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 65;
			
			eachNumber[index]++;
		}
		
		int resultIndex = 0;
		boolean isSame = false;
		
		for (int i = 1; i < eachNumber.length; i++) {
			
			if (eachNumber[resultIndex] < eachNumber[i]) {
				resultIndex = i;
				isSame = false;
			} else if (eachNumber[resultIndex] == eachNumber[i]) {
				isSame = true;
			}
		}
		
		char ch = (char)(resultIndex + 65);
		
		return isSame ? '?' : ch;
	}
}
