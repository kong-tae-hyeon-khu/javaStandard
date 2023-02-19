class ExceptionEx12 {
    public static void main(String args[]) throws Exception {
        method1(); // 같은 클래스 내의 static 함수.
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}