package Questions.Recursion;

public class ExponentOfStoN {
    public static int ExponentOfStoN(int x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        return x * ExponentOfStoN(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(ExponentOfStoN(3, 3));
    }
}
