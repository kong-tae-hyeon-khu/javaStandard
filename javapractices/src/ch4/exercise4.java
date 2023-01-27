package ch4;

public class exercise4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;
        
        int adder = 1;

        while (true) {
            num = adder * s;
            sum += num;

            if (sum >= 100)
                break;

            s = -s;
            adder += 1;
        }
        System.out.println(num);
    }
}
