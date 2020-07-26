package section3;

import java.util.Collection;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static List synchronizedList(List l) {
        return null;
    }

    public static void main(String[]args){
        ArrayList a = new ArrayList();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add(null);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2, "m");
        a.add("n");
        System.out.println(a);


        ArrayList b = new ArrayList();
        List l1 = synchronizedList(b);

    }
}
