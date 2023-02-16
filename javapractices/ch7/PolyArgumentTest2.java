class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
    }
    Product()  {} // Basic Constructor 
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

class Audio extends Product {
    Audio() {super(50);}
    public String toString() {return "audio";}
}

class Buyer {
    int money = 1000; // 소유 금액
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) { 
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println( p + "을/를 구입하였습니다.");
    }
    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + " 만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다. ");
    }
}

public class PolyArgumentTest2 {
    public static void main(String args[]) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}
