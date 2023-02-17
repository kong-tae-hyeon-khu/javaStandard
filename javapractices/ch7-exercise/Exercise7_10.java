class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    boolean getterPower() {return isPowerOn;}
    int getterChannel() {return channel;}
    int getterVolume() {return volume;}

    void setterPower() {
        isPowerOn = !isPowerOn;
    }
    void setterChannel(int channel) {
        if (channel <= MAX_CHANNEL && channel >= MIN_CHANNEL)
            this.channel = channel;
    }
    void setterVOLUME(int volume) {
        if (volume <= MAX_VOLUME && volume >= MIN_VOLUME)
            this.volume = volume;
    }
}


public class Exercise7_10 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setterChannel(10);
        System.out.println("CH : " + t.getterChannel());
        t.setterVOLUME(20);
        System.out.println("VOL : " + t.getterVolume());
    }
}
