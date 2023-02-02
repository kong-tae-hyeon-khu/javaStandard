package ch6;

class Product {
    static int count = 0; // 생성된 인스턴스의 갯수
    int serialNo; // 인스턴스 고유의 번호

    {
        ++ count;
        serialNo = count; 
    }

    public Product() {} // 기본 생성자, 생략 가능
}

public class ProductTest {
    public static void main(String argsp[]) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        
        System.out.println(p1.serialNo);
        System.out.println(p2.serialNo);
        System.out.println(p3.serialNo);

        System.out.println(Product.count);
    }
}
