class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object 클래스의 toString() 을 오버라이딩 한다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            if (i < CARD_NUM / 2 && ((i+1) == 1 || (i+1) == 3 || (i+1) == 8)) {
                cards[i] = new SutdaCard(i+1, true);
            }
            else if (i < CARD_NUM / 2) {
                cards[i] = new SutdaCard(i+1, false);
            }
            else {
                cards[i] = new SutdaCard(i % 10 + 1 , false);
            }
        }
    }

}



class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ", ");
    }
}