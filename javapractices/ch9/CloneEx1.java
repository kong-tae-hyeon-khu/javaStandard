public class CloneEx1 {
    public static void main(String args[]) {
        Point original = new Point(3,5);
        Point copy = (Point)original.clone();
        System.out.println(original);
        System.out.println(copy);

    }
}


class Point implements Cloneable { // Cloneable 인터페이슬르 구현한 클래스에서만 clone() 을 호출할 수 있다.
    int x, y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    public Object clone() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {} // Clone() 은 반드시 예외처리를 해주어야 한다.

        return obj;
    }
}