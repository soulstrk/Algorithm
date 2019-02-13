package 백준문제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			while(n > 0) {
				String ab = br.readLine();
				
				StringTokenizer st = new StringTokenizer(ab);
				
				int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
				
				bw.write(result+"\n");
				
				n--;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			br.close();
			bw.flush();
			bw.close();
		}
		
	}
}
