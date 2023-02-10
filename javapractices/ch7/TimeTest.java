class Time {
    private int hour, minute, second; // 같은 클래스 내에서만 접근 가능.
    Time (int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {return hour;}
    public int getMinute() {return minute;}
    public int getSecond() {return second;}

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

public class TimeTest {
    public static void main(String args[]) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);

     // t.hour = 13; 접근 제어자가 private 이므로 접근할 수 없다.
        t.setHour(t.getHour() + 1); // 현재 시간보다 1시간 후로 변경
        System.out.println(t);
    }

}
