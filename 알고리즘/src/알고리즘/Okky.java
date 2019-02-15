package 알고리즘;

import java.math.BigInteger;

// 1부터 100까지 합의 식을 코딩

public class Okky {
	public static void main(String[] args) {
		
		BigInteger sum = BigInteger.ONE;
		
		for (int i = 1; i < 100; i++) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(sum);
	}
}
