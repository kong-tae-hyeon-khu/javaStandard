package ch3;

public class OperatorEx2 {
	public static void main(String args[]) {
		int i = 5, j = 0;
		j = i++; // i 의 값을 먼저 읽어온 후, i 값 증
		System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i; // i 의 값을 먼저 증가 시킨 후, 값을 읽어 
		System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);
		
	}

}
