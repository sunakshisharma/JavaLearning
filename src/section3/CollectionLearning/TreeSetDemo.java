package section3.CollectionLearning;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("C");
        t.add("B");
        t.add("A");
        t.add("C");
        t.add("B");
        t.add("A");
        //deleting duplicate and sort the string automatically
        System.out.println(t);
    }
}
