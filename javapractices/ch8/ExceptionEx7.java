public class ExceptionEx7 {
    public static void main(String args[]) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.pritnln(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("True");
            System.out.println("Arithmetic Exception");
        } catch (Exception e) { // ArithmeticException 을 제외한 모든 예외 처리.
            System.out.println("Exception");
        } // Try-catch 끝.
    }
}
