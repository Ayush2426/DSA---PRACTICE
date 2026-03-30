package Questions.Stacks;

import java.util.Stack;

public class PushAtBottom {
    public static void stackBottomPush(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        stackBottomPush(data, st);
        st.push(top);
    }
}
