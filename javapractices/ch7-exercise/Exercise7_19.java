class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;


    void buy(Product p) {
        if (p.price > this.money) {
            System.out.println("잔액이 부족하여 " + p + "를/을 살 수 없습니다.");
            return;
        }
        this.money -= p.price;
        add(p);
    }

    void add(Product p) {
        if (i > cart.length - 1)
        {
            Product[] temp = cart;
            cart = new Product[cart.length * 2];
            for (int i = 0; i < temp.length; i++)
                cart[i] = temp[i];
        }
        cart[i] = p;
        i++;
    }

    void summery() {
        int result = 0;
        for (int i = 0; i < this.i; i ++) {
            System.out.print(cart[i] + ", ");
            result += cart[i].price;

        }
        System.out.print(result);
        System.out.println();
        System.out.println(this.money);
    }
}

class Product {
    int price;
    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() { super(100); }
    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer() {super(200);}
    public String toString() {return "Computer";}
}

class Audio extends Product {
    Audio() {super(50);}
    public String toString() {return "Audio";}
}


public class Exercise7_19 {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summery();
    }
}
