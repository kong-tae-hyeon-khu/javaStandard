package ch4;

public class exercise15 {
    public static void main(String args[]) {
        int number = 12321;
        int tmp = number;

        int result = 0;

        while (tmp != 0) {
            result = result + (tmp % 10);
            tmp /= 10;

            if (tmp == 0)
                break;
            result *= 10;
        }

        if (number == result)
            System.out.println("회문수입니다.");
        else 
            System.out.println("노노");
       
    }
}
