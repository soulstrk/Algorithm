package 알고리즘;

public class PrintDimensionArray {
	
	public static void printArray(int[][] arr) {
		for (int[] is : arr) {
			
			for (int i : is) {
				
				if (i == 0) {
					System.out.print("\t");
					continue;
				}
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}
