class Stack_ {
    String data;

    // Stack Implementation using Linkedlist
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Stack class declaration
    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        // Stack push function
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Stack pop function
        public static int pop() {
            if (isEmpty()) {
                System.out.println("The Stack is already empty!");
                return 0;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Stack Peek function
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return 0;
            }
            int top = head.data;
            return top;
        }

    }

    // Main function
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(8);
        st.push(7);
        st.push(6);
        st.push(5);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}