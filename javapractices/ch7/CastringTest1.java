class Car {
    String color;
    int dooir;

    void drive() {
        System.out.println("Drive, Brrrrr~");
    }
    void stop() {
        System.out.println("Stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("Water !");
    }
}

public class CastringTest1 {
    public static void main(String args[]) {
    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.water();
    car = fe; // car = (Car)fe; 에서 형변환 생략.
   // car.water(); Car 타입의 참조변수로는 water 를 사용할 수 없다.
    fe2 = (FireEngine)car; // 조상타입 -> 자손타입 
    fe2.water();

    }

    
}
