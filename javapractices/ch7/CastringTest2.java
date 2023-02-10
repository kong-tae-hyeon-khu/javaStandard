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

public class CastringTest2 {
    public static void main(String args[]) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
       // fe = (FireEngine)car;  에러 발생. -> 조상타입의 인스턴스를 자손타입의 참소변수로 참조하는 것은 허용되지 않는다.
       
    }
}
