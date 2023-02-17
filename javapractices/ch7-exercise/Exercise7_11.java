class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

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
        {
            this.prevChannel = this.channel;
            this.channel = channel;
          
        }
    }
    void setterVOLUME(int volume) {
        if (volume <= MAX_VOLUME && volume >= MIN_VOLUME)
            this.volume = volume;
    }

    void gotoPrevChannel() {
        int temp = this.channel;
        this.channel = this.prevChannel;
        this.prevChannel = temp;
    }
}


public class Exercise7_11 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();

        t.setterChannel(10);
        System.out.println("CH : " + t.getterChannel());
        t.setterChannel(20);
        System.out.println("VOL : " + t.getterChannel());

        t.gotoPrevChannel();
        System.out.println("CH : " + t.getterChannel());
        t.gotoPrevChannel();
        System.out.println("CH : " + t.getterChannel());

        
    }
}
