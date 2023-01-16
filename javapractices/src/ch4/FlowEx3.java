package ch4;
import java.util.*; // Scanner 클래스를 사용하기 위해 추

public class FlowEx3 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 > ");
		int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input 에 저장
		
		if (input == 0) {
			System.out.println("0 입니다.");
		}
		else {
			System.out.println("0 이 아닙니다.");
		}
		
	}
}
