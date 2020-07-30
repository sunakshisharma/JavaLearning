package section3.CollectionLearning;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap l = new LinkedHashMap<>();
        l.put(1,"Priyank");
        l.put(2,"Sunakshi");
        l.put("Priyank","Sunakshi");
        l.put("Sunakshi","Sunakshi");

        //order maintained and removing duplicate
        System.out.println(l);
    }
}
