package 자료구조;

public class Main {
	
	public static void main(String[] args) {
		
		ArrList arrList = new ArrList();
		
		arrList.add(3);
		arrList.add(4);
		arrList.add(8);
		arrList.add(5);
		
		arrList.remove(0);
		
		arrList.add(3);
		arrList.add(2);
		
		arrList.remove(0);
		
		arrList.print();
		System.out.println();
		
		arrList.add(11, 0);
		arrList.add(11, 3);
		
		arrList.add(150, 10);
		
		arrList.print();
	}
}
