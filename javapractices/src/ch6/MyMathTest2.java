package ch6;

class MyMath2 {
    long a, b;
    // 인스턴스 변수를 사용하므로, 인스턴스 메서드로 선언. (static X)
    long add() {return a + b;}
    long sub() {return a - b;}
    long multiply() {return a * b;}
    double divide() {return a / (double) b;}
    
    // 인스턴스 변수와 관계없이 매개변수로만 작업이 가능하다.
    static long add(long a, long b) {return a + b;}
    static long sub(long a, long b) {return a - b;}
    static long multiply(long a, long b) {return a * b;}
    static double divide(double a, double b) {return a / b;} // 자동 형변환
}

public class MyMathTest2 {
    public static void main(String args[]) {
        // 클래스 메서드 호출. 인스턴스 생성 없이 호출 가능
        System.out.println(MyMath2.add(200L, 100l));
        System.out.println(MyMath2.sub(200L, 100L));
        System.out.println(MyMath2.multiply(200, 100));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
        System.out.println(mm.sub());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
