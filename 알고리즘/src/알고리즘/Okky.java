package �˰���;

import java.math.BigInteger;

// 1���� 100���� ���� ���� �ڵ�

public class Okky {
	public static void main(String[] args) {
		
		BigInteger sum = BigInteger.ONE;
		
		for (int i = 1; i < 100; i++) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(sum);
	}
}
