import java.util.Stack;

public class Stack_coll {
    public static void main(String[] args){
        Stack st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
