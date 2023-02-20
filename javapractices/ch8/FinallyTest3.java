public class FinallyTest3 {
    public static void main(String args[]) {
        // method1() 은 static 메서드 이므로, 인스턴스 생성없이 호출이 가능하다.
        FinallyTest3.method1();
        System.out.println("method1() 의 수행을 마치고 main 메서드로 돌아왔습니다.");
    }

    static void method1() {
        try {
            System.out.println("method1() 이 호출되었습니다.");
            return; // method1 종료.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1() 의 finally 블럭이 생성되었습니다.");
        }
    }
}
// return 으로 함수를 종료시키기전에도 finally 블럭이 실행된 후, 종료된다.