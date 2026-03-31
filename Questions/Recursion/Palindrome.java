package Questions.Recursion;

public class Palindrome {
    public static boolean checkPalindrom(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return checkPalindrom(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrom("adrrda"));
    }
}
