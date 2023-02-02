package ch6;

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(Car c) { // 매개변수로 들어온 인스턴스를 똑같이 복사.
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    static void printCar(Car c) {
        System.out.println("--------------------------");
        System.out.println("color : " + c.color);
        System.out.println("gearType : " + c.gearType);
        System.out.println("door : " + c.door);
        System.out.println("--------------------------");
    }
}

public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        
        Car.printCar(c1);
        Car.printCar(c2);
        
        c1.door = 100;

        Car.printCar(c1);
        Car.printCar(c2);
    }
}
