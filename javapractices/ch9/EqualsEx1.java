public class EqualsEx1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        
        if (v1.equals(v2)) {
            System.out.println("v1 과 v2 는 같습니다.");
        } else {
            System.out.println("v1 과 v2 는 다릅니다.");
        }
        v2 = v1;

        if (v1.equals(v2))
            System.out.println("v1 과 v2 는 같습니다.");
        else
            System.out.println("v1 과 v2 는 다릅니다.");
    }
}
// Class 의 접근 제한자 -> public or default (다른 패키지의 클래스는 접근할 수 없다.)
class Value {
    int value;
    protected Value(int value) {
        this.value = value;
    }
}

