package Questions.Recursion;

public class NumberPrintDec {
    public static void printNum(int n) {
        if (n == 0) {
            // return 0;
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void main(String[] args) {
        NumberPrintDec np = new NumberPrintDec();
        np.printNum(5);
    }
}
