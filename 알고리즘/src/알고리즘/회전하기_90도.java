package 알고리즘;

public class 회전하기_90도 {
	
	public static void main(String[] args) {
		int[][] originalArray = new int[5][5];
		int tmp = 0;
		
		for (int i = 0; i < originalArray.length; i++) {
			
			for (int j = 0; j < originalArray.length; j++) {
				tmp++;
				
				originalArray[i][j] = tmp;
			}
		}
		
		PrintDimensionArray.printArray(originalArray);
		
		/**
		 *  -----------------------------------------------------
		 */
		System.out.println();
		System.out.println();
		
		int[][] newArray = new int[5][5];
		
		for (int i = 0; i < newArray.length; i++) {
			
			for (int j = 0; j < newArray.length; j++) {
				newArray[i][j] = originalArray[4-j][i];
			}
		}
		
		PrintDimensionArray.printArray(newArray);
	}
}
