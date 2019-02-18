package 백준문제;

import java.util.Arrays;
import java.util.Scanner;

public class Back2941_re {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int result = 0;
		String inputStr = sc.next();
		
		while (true) {
			
			if (inputStr.contains("c=")) {
				inputStr = inputStr.replaceFirst("c=", " ");
				result++; continue;
			} else if (inputStr.contains("c-")) {
				inputStr = inputStr.replaceFirst("c-", " ");
				result++; continue;
			} else if (inputStr.contains("dz=")) {
				inputStr = inputStr.replaceFirst("dz=", " ");
				result++; continue;
			} else if (inputStr.contains("d-")) {
				inputStr = inputStr.replaceFirst("d-", " ");
				result++; continue;
			} else if (inputStr.contains("lj")) {
				inputStr = inputStr.replaceFirst("lj", " ");
				result++; continue;
			} else if (inputStr.contains("nj")) {
				inputStr = inputStr.replaceFirst("nj", " ");
				result++; continue;
			} else if (inputStr.contains("s=")) {
				inputStr = inputStr.replaceFirst("s=", " ");
				result++; continue;
			} else if (inputStr.contains("z=")) {
				inputStr = inputStr.replaceFirst("z=", " ");
				result++; continue;
			}
			break;
		}
		
		System.out.println(result + inputStr.replace(" ", "").length());
	}
}
