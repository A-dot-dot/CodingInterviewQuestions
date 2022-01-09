public class Fibonacci_509 {
    public int fib(int n) {
        if(n < 0 || n > 30) {
            throw new IllegalArgumentException("Input is invalid");
        } else if(n <= 1) {
            return n;
        }

        int a = 0,  b = 1;
        for(int i=2; i<=n; i++) {
            int sum =  a+b;
            a = b;
            b = sum;
        }

        return b;
    }
}
