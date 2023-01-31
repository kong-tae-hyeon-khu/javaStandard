package ch6;

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x; // 매개변수가 있는 생성자.
    }
}

public class ConstructorTest {
    public static void main(String args[]) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(); // 컴파일 에러.
    }
}


