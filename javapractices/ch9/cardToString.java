class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}


public class cardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();
        // toString (Overriding X) -> Class name + 16진수 Hash Code
        System.out.println(c1.toString());
        System.out.println(c2.toString()); 
    }
}
