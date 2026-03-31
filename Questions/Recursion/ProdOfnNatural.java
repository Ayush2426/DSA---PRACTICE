package Questions.Recursion;

public class ProdOfnNatural {
    public static int SumOfNumber(int n) {
        if (n == 0)
            return 1;
        return n * SumOfNumber(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(SumOfNumber(5));
    }
}
