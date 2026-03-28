class LL {
    // Custom LinkedList creation
    Node head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add operation
    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    // Traverse and print the elements of the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("Null ");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL ls = new LL();
        ls.addFirst("One");
        ls.addFirst("Two");
        ls.addFirst("Three");
        // ls.printList();
        ls.addLast("Three");
        ls.addLast("Two");
        ls.addLast("One");
        ls.printList();
        ls.deleteFirst();
        ls.printList();
        ls.deleteLast();
        ls.printList();
        ls.getSize();
    }
}
