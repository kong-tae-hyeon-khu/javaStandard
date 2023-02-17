class Product
{
    int price;
    int bonusPoint;
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product
{
    // Tv() {} // Product 의 기본 생성자가 정의되어 있지 않기 때문이다.
    Tv() {
        super(0);
    }

    public String toString() {
        return "Tv";
    }
}

public class Exercise7_5 {
    public static void main(String args[]) {
        Tv t = new Tv();
    }
}
