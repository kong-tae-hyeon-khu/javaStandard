package ch6;

class Tv {
    // Tv의 속성 (멤버 변수)
    String color; // 색상
    boolean power; // 전원상태 (on/off)
    int channel; // 채널

    // Tv의 기능 (메서드)
    void power() {power = !power;}
    void channelUp() { ++ channel;}
    void channelDown() {-- channel;}
}

public class TvTest {
    public static void main(String args[]) {
        Tv t; // Tv 인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv(); // Tv 인스턴스를 생성한다.
        t.channel = 7; 
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다. ");
    }
}
