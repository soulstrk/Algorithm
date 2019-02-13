package 알고리즘;

import java.lang.reflect.Array;
import java.util.Scanner;

public class 오른쪽에_빈_삼각형만들기 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("배열의 값 입력");
		
		int arrLength = sc.nextInt();
		
		int[][] triArr = new int[arrLength][arrLength];
		int middle = arrLength/2;
		int increment = 0;
		int L = 0;
		
		for (int i = 0; i < triArr.length; i++) {
			
			if (i <= middle) {
				L = triArr.length - i;
			} else {
				L = i + 1;
			}
			
			for (int j = 0; j < L; j++) {
				System.out.println(L);
				increment++;
				
				triArr[i][j] = increment;
			}
		}
		
		for (int[] is : triArr) {
			for (int i : is) {
				if (i == 0) continue;
				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}
}
