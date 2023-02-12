class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
    }
}

class Tv extends Product {
    Tv() {
        // 조상클래스의 생성자 Product(int price) 를 호출한다.
        super(100); // Tv 의 가격 100만원.
    }
    public String toString() {return "tv";}
}

class Computer extends Product {
    Computer() {super(200);}
    public String toString() {return "computer";}
}

class Buyer {
    int money = 1000; // 소유 금액
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) { 
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println( p + "을/를 구입하였습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String args[]) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
