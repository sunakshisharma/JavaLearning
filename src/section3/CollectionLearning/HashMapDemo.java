package section3.CollectionLearning;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap h = new HashMap<>();
        h.put(1,"Priyank");
        h.put(2,"Sunakshi");
        h.put(3,"Baby1");
        h.put("Priyank","Sunakshi");
        h.put("Sunakshi","Sunakshi");
        h.put("Sunakshi","Sunakshi");

        //order not maintained and removing duplicate
        System.out.println(h);
        h.remove(3);
        System.out.println(h);
    }
}
