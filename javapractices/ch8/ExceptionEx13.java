public class ExceptionEx13 {
    public static void main(String args[]) {
        method1();
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드 에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
