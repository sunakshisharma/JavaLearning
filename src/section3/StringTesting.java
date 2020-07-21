package section3;

import java.util.Scanner;

public class StringTesting {

    public static void main(String[] args){
        String s1 = "Computer";
        String s2 ="cOmPuTeR";
        System.out.println("Comparision " + (s1 == s2));
        System.out.println("Comparision " + s1.equals(s2));
        System.out.println("Comparision " + s1.compareTo(s2));
        System.out.println("Comparision " + s1.equalsIgnoreCase(s2));

        System.out.println("Conversion " + s1.toUpperCase());
        System.out.println("Conversion " + s1.toLowerCase());
        System.out.println("Index of: " + s1.indexOf("m"));
        System.out.println("Index of: " + s1.indexOf('m',0));
        System.out.println("Index of:" + s1.indexOf("ter"));
        System.out.println("Character At " + s1.charAt(4));
        System.out.println("Sub-string " + s1.substring(2));
        System.out.println("Sub-string " + s1.substring(2,5));
        System.out.println("Replace " + s1.replace('m', 'M'));

        StringBuffer s3 = new StringBuffer("hello");
        System.out.println(s3);

        StringBuffer s4 = new StringBuffer();
        s4.append("I ");
        s4.append("am ");
        s4.append("a ");
        s4.append("good student ");
        System.out.println(s4);

        s3.delete(3,s3.length());
        System.out.println(s3);

        System.out.println("Comparision" + s3.equals(s4));

        String str1 = new String("raj");
        String str2 = new String("raj");
        System.out.println(str1 == str2);



    }
}
