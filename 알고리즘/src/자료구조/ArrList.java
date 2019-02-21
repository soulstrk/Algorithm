package 자료구조;

public class ArrList {
	
	private int[] arr = new int[0];
	
	public void add(Integer i) {
		int[] newArr = new int[arr.length + 1];
		newArr[newArr.length - 1] = i;
		
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		
		arr = newArr;
	}
	
	public void add(Integer i, int index) {
		
		if (arr.length < index+1) {
			return;
		}
		
		int[] newArr = new int[arr.length + 1];
		
		for (int j = 0, y = 0; j < newArr.length; j++,y++) {
			
			if (j == index) {
				newArr[j] = i;
				y--;
			} else {
				newArr[j] = arr[y];
			}
		}
		
		arr = newArr;
	}
	
	public void remove(int index) {
		
		if (arr.length < index+1) {
			return;
		}
		
		int[] newArr = new int[arr.length - 1];
		
		for (int i = 0, j = 0; j < arr.length; i++,j++) {
			if (index != i) {
				newArr[i] = arr[j];
			} else {
				i--;
				index = -1;
			}
		}
		
		arr = newArr;
	}
	
	public int size() {
		return arr.length;
	}
	
	public void print() {
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}
}
