package ch4;
import java.util.*;

public class FlowEx2 {
	public static void main(String[] args)
	{
		int input;
		
		System.out.print("숫자를 하나 입력하세요 >");
		
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 temp 에 저장.
		input = Integer.parseInt(temp); // 입력받은 문자열을 숫자로 전환
		
		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다. ");
		}
		if (input != 0) 
			System.out.println("입력하신 숫자는 0이 아닙니다. ");
			System.out.printf("입력하신 숫자는 %d입니다. ", input);
	}

}
