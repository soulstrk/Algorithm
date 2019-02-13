package 알고리즘;

public class 이등변_삼각형_만들기 {
	
	public static void main(String[] args) {
		int readNum = 4;
		int[][] triArr = new int[(4-1)*2+1][4];
		int increment = 0;
		
		for (int j = 0; j < triArr[0].length; j++) {
			
			for (int i = readNum-1-j; i <= readNum-1+j; i++) {
				increment++;
				
				triArr[i][j] = increment;
			}
		}
		
		for (int[] is : triArr) {
			
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
