package section3;

import java.util.Scanner;

public class StringComparision {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string1: ");
        String a = in.nextLine();

        System.out.print("Enter a string2: ");
        String b = in.nextLine();

        System.out.println("Equality is " + a.equalsIgnoreCase(b));
    }
}
