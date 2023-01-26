package ch4;
import java.util.*;


public class FlowEx17 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int line = scanner.nextInt();
		
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
		
	}
}
