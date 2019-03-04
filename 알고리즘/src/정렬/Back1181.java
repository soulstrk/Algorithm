package Á¤·Ä;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1181 {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		
		String[] words = new String[n];
		
		for (int i = 0; i < n; i++) {
			words[i] = br.readLine();
		}
		
		for (int i = 0; i < words.length; i++) {
			
			for (int j = 0; j < words.length - i - 1; j++) {
				
				if (words[j].length() > words[j+1].length()) {
					String tmp = words[j];
					words[j] = words[j + 1];
					words[j + 1] = tmp;
				} else if (words[j].length() == words[j+1].length()) {
					
					for (int j2 = 0; j2 < words[j].length(); j2++) {
						
						if (words[j].charAt(j2) > words[j+1].charAt(j2)) {
							String tmp = words[j];
							words[j] = words[j + 1];
							words[j + 1] = tmp;
							break;
						} else if (words[j].charAt(j2) == words[j+1].charAt(j2)) {
							continue;
						} else {
							break;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < words.length; i++) {
			if (i != 0) {
				if (words[i].equals(words[i-1])) {
					continue;
				}
			}
			System.out.println(words[i]);
		}
	}
}
