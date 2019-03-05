package Ω∫≈√;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Back10828 {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			String input = br.readLine();
			
			branch(input);
		}
	}

	private static void branch(String input) {
		String[] arr = input.split(" ");
		
		switch (arr[0]) {
		case "pop":
			pop();
			break;
		case "size":
			size();
			break;
		case "empty":
			empty();
			break;	
		case "top":
			top();
			break;
		case "push":
			push(arr[1]);
			break;	
		}
	}

	private static void push(String string) {
		int num = Integer.parseInt(string);
		list.add(num);
	}

	private static void pop() {
		
		if (list.size() < 1) {
			System.out.println("-1");
			return;
		}
		
		System.out.println(list.get(list.size() - 1));
		list.remove(list.size() - 1);
	}
	
	private static void top() {
		
		if (list.size() < 1) {
			System.out.println("-1");
			return;
		}
		
		System.out.println(list.get(list.size() - 1));
	}

	private static void empty() {
		System.out.println(list.size() == 0 ? "1" : "0");
	}

	private static void size() {
		System.out.println(list.size());
	}

	
	
}
