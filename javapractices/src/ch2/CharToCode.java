package ch2;

class CharToCode {
	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65;
		int code = (int)ch; // ch에 저장된 값을 int타입으로 형변환
		
		System.out.printf("%c = %d(%#X)%n", ch, code, code);
		
		char hch = '가'; // char chc = 0xAC00
		
		System.out.printf("%c = %d(%#X)%n", hch, (int)hch, (int)hch);
	}
}
