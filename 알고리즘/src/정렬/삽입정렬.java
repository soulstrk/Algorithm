package 정렬;

import java.util.Arrays;

public class 삽입정렬 {
	
	public static void main(String[] args) {
		int[] inputArray = {33,2,14,17,11,5,25,7,19};
		int tmp = 0;
		int j 	= 0;
		int test = 0;
		
		for (int i = 1; i < inputArray.length; i++) {
			j = i - 1;
			int standard = inputArray[i];
			
			while(standard < inputArray[j]) {
				test++;
				
				if (inputArray[j+1] <= inputArray[j]) {
					tmp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = tmp;
				} else {
					break;
				}
				
				j--;
				if(j < 0) break;
			}
		}
		
		System.out.println(Arrays.toString(inputArray));
		System.out.println(test);
	}
}
