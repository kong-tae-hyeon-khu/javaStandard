package ch6;



public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv; // 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없다.
    static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용 가능.
    
    static void staticMethod() {
        System.out.println(cv);
    //   System.out.println(iv); // 에러. 클래스 메서드에서 인스턴스 변수 사용 불가.
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod() {
        System.out.println(iv);
        System.out.println(cv); // 인스턴스 메서드에서는 둘 다 자유롭게 사용 가능.
    }
    static void staticMethod2() {
        staticMethod();
        // instanceMethod(); // 에러. 클래스 메서드에서는 인스턴스 메서드 호출 불가.
        MemberCall c = new MemberCall();
        c.instanceMethod();
    }

    void instanceMethod2() {
        // instance Method 는 둘 다 자유롭게 사용 가능.
        staticMethod();
        instanceMethod();
    }
}
