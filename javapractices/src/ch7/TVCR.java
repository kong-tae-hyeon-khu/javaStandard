package ch7;

class Tv {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class VCR {
    boolean power;
    int counter = 0;
    void power() {power = !power;}
    void play() {/* 내용생략 */}
    void stop() {/* 내용생략 */}    
    void rew() {/* 내용생략 */}
    void ff() {/* 내용생략 */}    
}


class TVCR extends Tv {
    VCR vcr = new VCR();// VCR 클래스를 포함시켜서 사용한다.
    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}
