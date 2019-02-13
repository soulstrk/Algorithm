package 정렬;

import java.util.Arrays;

public class 삽입정렬2 {
	public static void main(String[] args) {
		int [] arr = {33,2,14,17,11,5,25,7,19};
		int test = 0;
		

		for (int i = 1; i < arr.length; i++) {

			int standard = arr[i];  // 기준

			int aux = i - 1;   // 비교할 대상
			

			while (aux >= 0 && standard < arr[aux]) {
				test++;
				arr[aux + 1] = arr[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄

				aux--;

			}

			arr[aux + 1] = standard;  // 기준값 저장

		}

		System.out.println(Arrays.toString(arr));
		System.out.println(test);
		System.out.println("asd");
	}
}
