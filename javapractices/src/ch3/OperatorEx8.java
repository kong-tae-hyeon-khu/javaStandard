package ch3;

public class OperatorEx8 {
	public static void main(String args[]) {
		int a = 1_000_000; // 1 백만 
		int b = 2_000_000; // 2 백만 
		
		long c = a * b; // int Over Flow
		
		System.out.println(c); 
	}
}
