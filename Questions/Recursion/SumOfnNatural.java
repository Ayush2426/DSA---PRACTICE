package Questions.Recursion;

public class SumOfnNatural {
    public static int SumOfnNatural(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * SumOfnNatural(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(SumOfnNatural(5));
    }
}
