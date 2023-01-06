package ch3;

public class OperatorEx6 {
	public static void main(String args[]) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // 컴파일 에러가 발생한다. int 보다 작은 값들의 연산에서 자동으로
						// int 로의 형변환이 일어나기 때문이다  
		
		System.out.println(c);
	}
}
