package Questions.Recursion;

public class ReverseString {
    public String revString(String s){
        if(s == null || s.length() < 1){
            return s;
        }
        return revString(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.revString("AYushKumarVerma"));
    }
}
