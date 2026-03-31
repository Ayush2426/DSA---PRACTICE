package Questions.Recursion;

public class Fibonacci {
    public static int Fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int c = Fibonacci(n - 1) + Fibonacci(n - 2);
        return c;
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
    }
}
