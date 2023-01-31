package ch6;

public class FactorialTest {

    static int factorial(int n) 
    {
        int result;
        if (n == 1)
            result = 1;
        else
            result = n * factorial(n - 1);

        return result;
    }
    public static void main(String args[]) {
        int result = factorial(4);
        System.out.println(result);
        System.out.println(loopfactorial(4));
        
    }
    // JVM 의 Stack 에 인자들이 계속해서 쌓이지 않으므로, 메모리 부족문제를 겪지 않을 수 있다. + 속도도 더 빠르다.
    static int loopfactorial(int n) {
        int result = 1;
        while (n != 0 )
            result *= n-- ;
        return result;
    }
}
