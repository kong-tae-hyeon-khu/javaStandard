package ch6;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args) 시작");
        firstMethod(); // static 메서드는 객체 생성없이 호출 가능하다.
        System.out.println("main(String[] args) 종료");
    }

    static void firstMethod() {
        System.out.println("firstMethod() 시작");
        secondMethod();
        System.out.println("firstMethod() 종료");
    }

    static void secondMethod() {
        System.out.println("secondMethod() 시작");
        System.out.println("secondMethod() 종료");
    }
}
