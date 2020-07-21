package section3;

import java.util.Scanner;

public class StringConcatination {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the string1: ");
        String a= in.nextLine();

        System.out.println("Please enter the string2: ");
        String b= in.nextLine();

        String c = a + b;
        System.out.println(c);
    }
}
