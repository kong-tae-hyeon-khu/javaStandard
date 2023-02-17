class Parent {
    int x= 100;

    Parent() {
        this(200);
    }
    Parent(int x) {
        this.x = x;
    }
    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 3000;
    Child() {
        this(1000);
    }
    Child(int x) {
        this.x = x;
        
    }
}

public class Exercise7_7 {
    public static void main(String args[]) {
        // Parent() -> Parent(int) -> Child() -> Child(int) 
        Child c = new Child();
        // c.getX() : 부모 클래스의 x 를 얻는 메서드이다. vs c.x : 이는 자식 클래스의 진짜 x.
        System.out.println("x = " + c.getX());
        System.out.println(c.x);
    }
}
