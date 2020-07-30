package section3.CollectionLearning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListdemo {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();

        // Populating a link list
        l.add("Sunakshi");
        l.add("Priyank");
        l.add("Baby1");
        l.add(null);
        System.out.println(l);

        l.remove(null);

        ListIterator i = l.listIterator();
        // Loop for visiting each element
        while (i.hasNext()){
            String se = (String) i.next();
            if (se.equalsIgnoreCase("SunAkshi")){
                i.remove();
            }
        }
        System.out.println("List is " + l);
    }
}
