package ����;

import java.util.Arrays;

public class ��������2 {
	public static void main(String[] args) {
		int [] arr = {33,2,14,17,11,5,25,7,19};
		int test = 0;
		

		for (int i = 1; i < arr.length; i++) {

			int standard = arr[i];  // ����

			int aux = i - 1;   // ���� ���
			

			while (aux >= 0 && standard < arr[aux]) {
				test++;
				arr[aux + 1] = arr[aux];   // �񱳴���� ū ��� ���������� �о

				aux--;

			}

			arr[aux + 1] = standard;  // ���ذ� ����

		}

		System.out.println(Arrays.toString(arr));
		System.out.println(test);
		System.out.println("asd");
	}
}
