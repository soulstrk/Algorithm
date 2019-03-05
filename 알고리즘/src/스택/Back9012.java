package Ω∫≈√;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back9012 {
	
private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			String isVPS = br.readLine();
			
			checkVPS(isVPS);
		}
	}

	private static void checkVPS(String isVPS) {
		Stack<Character> st = new Stack<>();
		boolean flag = true;
		int i = 0;
		
		while (i < isVPS.length()) {
			
			if (isVPS.charAt(i) == '(') {
				st.push('(');
			} else if (isVPS.charAt(i) == ')') {
				
				if (!st.isEmpty()) {
					
					if (st.peek() == '(') {
						st.pop();
					}
				} else {
					flag = false;
					break;
				}
			}
			
			i++;
		}
		
		if (!st.isEmpty()) flag = false;
		
		System.out.println(flag ? "YES" : "NO");
		
	}
}
