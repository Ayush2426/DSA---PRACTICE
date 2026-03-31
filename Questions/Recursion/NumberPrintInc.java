package Questions.Recursion;

public class NumberPrintInc {
    public static void NumberPrintInc(int m, int n) {
        if (n == m - 1) {
            return;
        }
        System.out.println(m);
        NumberPrintInc(m + 1, n);
    }

    public static void main(String[] args) {
        NumberPrintInc(1, 6);
    }
}
