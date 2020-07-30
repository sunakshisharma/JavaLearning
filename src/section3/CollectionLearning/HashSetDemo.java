package section3.CollectionLearning;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h = new HashSet<>();
        h.add("B");
        h.add("Z");
        h.add("D");
        h.add(null);
        h.add(10);
        h.add("a");
        h.add(9);

        // Insertion order not preserved and duplicate not allowed
        System.out.println(h);
    }
}
