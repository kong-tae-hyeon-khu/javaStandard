public class ExceptionEx1 {
    public static void main(String args[]) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
            try { } catch (Exception e1) {} // 에러, 변수 e 가 중복.
        } // try - catch의 끝.

        try {

        } catch (Exception e) {}
    }
}
