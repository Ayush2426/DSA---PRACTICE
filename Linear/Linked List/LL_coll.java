import java.util.*;
public class LL_coll {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.addFirst("HEAD");
        ls.addFirst("One");
        ls.addFirst("Two");
        ls.addLast("Two");
        ls.addLast("One");
        ls.add("Last added");
        ls.remove();//can be also removed using indexing too
        ls.removeFirst();
        ls.removeLast();
        ls.size();
        // System.out.print(ls);
        
        for(int i = 0; i < ls.size(); i++){
            System.out.print(ls.get(i) + " -> ");
        }
    }
}
