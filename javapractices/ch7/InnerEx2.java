class InnerEx2 {
    class InstanceInner {}
    static class StaticInner {}

    // 인스턴스 멤버 간에도 서로 직접 접근이 가능하다.
    InstanceInner iv = new InstanceInner();
    // static 멤버 간에는 서로 직접 접근이 가능하다.
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // static 멤버는 인스턴스 멤버에 접근할 수 없다.
    //  InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 굳이 접근하려면 아래와  같이 객체를 생성해야한다.
        // 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        // 인스턴스메서드에서는 인스턴스 멤버와 static 멤버 모두 접근 가능하다.
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        LocalInner lv = new LocalInner();
    }
    void myMethod() {
        class LocalInner {}
        LocallInner lv = new LocalInner();
    }
}
