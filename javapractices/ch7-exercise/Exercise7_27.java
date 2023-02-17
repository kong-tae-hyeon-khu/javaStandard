class Outer {
    int value = 10;
    
    class Inner {
        int value = 20;
        void method() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(new Outer().value);
        }
    }
}


public class Exercise7_27 {
    public static void main(String args[]) {
        Outer.Inner inner = new Outer().new Inner();
        inner.method();
    }
}
