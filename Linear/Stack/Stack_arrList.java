import java.util.ArrayList;

public class Stack_arrList {
    static class Stack {
        static ArrayList<Integer> st = new ArrayList<>();

        // Check if the list is empty or not
        public static boolean isEmpty() {
            return st.size() == 0;
        }

        // Stack push function
        public static void push(int data) {
            st.add(data);
        }

        // Stack pop function
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is already empty!");
                return 0;
            }
            int top = st.get(st.size() - 1);
            st.remove(st.size() - 1);
            return top;
        }

        // Stack peek function
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return 0;
            }
            int top = st.get(st.size() - 1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(9);
        st.push(8);
        st.push(7);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
