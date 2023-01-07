package ch3;

public class OperatorEx12 {
	public static void main(String args[]) {
		char c1 = 'a'; // c1 에는 문자 'a' 의 값 97
		char c2 = c1; // c1 의 값이 c2 에 저장 
		char c3 = ' '; // c3 공백으로 초기화 
		
		int i = c1 + 1;
		c3 = (char)(c1 + 1);
		
		c2++;
		c2++;
		
		System.out.println("i = " + i);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
	}
}
