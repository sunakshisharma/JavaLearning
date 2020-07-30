package section3.CollectionLearning;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        //Loop for populating array list
        for (int i = 0; i <= 10; i++) {
            a.add(i);
        }
        System.out.println(a);

        Iterator b = a.iterator();
        // Loop for visiting each element of a array list using iterator
        while (b.hasNext()) {
            Integer i = (Integer) b.next();
            if (i%2==0) {
                b.remove();
            }
        }
        System.out.println(a);

    }
}
