package 정렬;

import java.util.Arrays;

public class 선택정렬 {
	
	public static void main(String[] args) {
		
		int[] inputArray 	= {1,33,22,17,40,3,8,19,2,25,22,31};
		int minNumberIndex	= 0;
		int tmp 			= 0;
		
		for (int i = 0; i < inputArray.length - 1; i++) {
			minNumberIndex = i;
			
			for (int j = i+1; j < inputArray.length; j++) {
				if (inputArray[minNumberIndex] <= inputArray[j]) {
					minNumberIndex = j;
				}
			}
			
			tmp = inputArray[minNumberIndex];
			inputArray[minNumberIndex] = inputArray[i];
			inputArray[i] = tmp;
		}
		
		System.out.println(Arrays.toString(inputArray));
	}
}
