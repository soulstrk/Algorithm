package 백준문제;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];

        for (int i = 0; i < t; i++) {
            int count = 0;
            int ho = 1;
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            for (int j = 0; j < n; j++) {
                if (count >= h) {
                    ho++;
                    count = 0;
                }
                count++;
            }
            ans[i] = count * 100 + ho;

        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
