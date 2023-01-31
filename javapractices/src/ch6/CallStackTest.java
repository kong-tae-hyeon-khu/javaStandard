package ch6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod(); // static 메서드는 객체 생성없이 호출 가능하다.
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }
}

/*  호출 스택의 변화
1. 
2. main
3. main -> firstMethod
4. main -> firstMethod -> secondMethod 
5. main -> firstMethod -> secondMethod -> println
6. main -> firstMethod -> secondMethod
7. main -> firstMethod
8. main
9.
*/