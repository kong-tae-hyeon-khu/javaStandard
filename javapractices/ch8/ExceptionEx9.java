public class ExceptionEx9 {
    public static void main(String args[]) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e; // 예외 발생시키기.
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
