package Questions.Recursion;

public class StringLength {
    public static int StringLength(String s){
        if(s.equals("")) return 0;
        return 1 + StringLength(s.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(StringLength("Ayushhhhhhh"));
    }
}
