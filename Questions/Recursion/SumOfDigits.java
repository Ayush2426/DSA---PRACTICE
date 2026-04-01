package Questions.Recursion;

public class SumOfDigits {
    public int SOD(int n){
        if(n == 0){
            return 0;
        }
        return n % 10 + SOD(n / 10);
    }
    public static void main(String[] args) {
        SumOfDigits sod = new SumOfDigits();
        System.out.println(sod.SOD(123456));
    }
}
