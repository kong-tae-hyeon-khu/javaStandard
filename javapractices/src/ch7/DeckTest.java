package ch7;




class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = 52; // 카드의 개수 상수로 고정.
    Card cardArr[] = new Card[CARD_NUM];

    Deck() { // Deck 카드를 초기화한다.
        int i = 0;
        for(int k = Card.KIND_MAX; k > 0; k--)
            for (int n = 0; n < Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n+1);
    }

    Card pick(int index) {
        return cardArr[index];
    }
    Card pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }
    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
} // Deck 클래스의 끝.

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMONE = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 10은 X로 표현.
        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}

