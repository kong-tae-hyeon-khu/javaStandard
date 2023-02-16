class A {
    void methodA() {
        I i = InstanceManger.getInstance(); // B instance 리턴.
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I {
    public abstract void methodB();
}

class B implements I {
    public void methodB() {
        System.out.println("methodB in B class");
    }

    public String toString() {return "class B";}
}

class InstanceManger {
    public static I getInstance() {
        return new B();
    }
}

public class InterfaceTest3 {
    public static void main(String args[]) {
        A a = new A();
        a.methodA();
    }
}
