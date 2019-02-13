package 백준문제;

import java.util.Scanner;

public class Back1065 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n 		= sc.nextInt();
		int[] arr 	= new int[3];
		int sum 	= 0;
		
		if (n < 1 || n > 1000) {
			return;
		}
		
		if (n < 100) {
			System.out.println("99");
			return;
		}
		
		sum = 99;
		
		for (int i = 100; i <= n; i++) {
			
			arr[0] = i/100; 
			arr[1] = i/10 - arr[0]*10; 
			arr[2] = i - (arr[0]*100) - (arr[1]*10); 
			
			if (arr[0] - arr[1] == arr[1] - arr[2]) {
				sum ++;
			}
		}
		
		System.out.println(sum);
	}
}


/*
 * public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
         
        if (n < 100) {
            System.out.println(n);
        } else {
            int result = 99;
             
            for (int i = 100; i <= n; ++i) {
                result += checkHanNumber(i);
            }
             
            if (n == 1000) result--;
             
            System.out.println(result);
        }
    }
     
    private static int checkHanNumber(int number) {
        int num1 = number / 100 % 10;
        int num2 = number / 10 % 10;
        int num3 = number % 10;
         
        if (num2 * 2 == num1 + num3) {
            return 1;
        }
        return 0;
    }
}
*/
