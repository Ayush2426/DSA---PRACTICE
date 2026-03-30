package Questions.Stacks;

import java.util.Stack;

public class ReverseStack {

    public static void stack_BottomPush(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
        }
        int top = st.pop();
        stack_BottomPush(data, st);
        st.push((top));
    }

    public static void reverse(Stack<Integer> st){
        int top = st.pop();
        reverse(st);
        stack_BottomPush(top, st);
    }
}
