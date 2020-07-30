package section3.CollectionLearning;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet l = new LinkedHashSet();
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("Z");
        l.add(null);
        l.add(10);
        l.add("Z");

        // insertion order preserved and duplicate not allowed
        System.out.println(l);
    }
}
