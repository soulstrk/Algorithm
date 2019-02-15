package 백준문제;

import java.util.Scanner;

public class Back1316 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int groupWordNumber = 0;
		
		for (int i = 0; i < n; i++) {
			String inputWord = sc.next();
			
			if(isGroupWord(inputWord)) {
				groupWordNumber++;
			}
		}
		
		System.out.println(groupWordNumber);
		
	}

	private static boolean isGroupWord(String inputWord) {
		int[] alphabets = new int[26];
		
		for (int i = 0; i < inputWord.length(); i++) {
			int index = inputWord.charAt(i) - 97;
			
			if (alphabets[index] != 0) {
				
				if (inputWord.charAt(i) != inputWord.charAt(i-1)) {
					return false;
				}
			}
			alphabets[index]++;
		}
		
		return true;
	}
}
