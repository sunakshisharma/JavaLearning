package section3;

import java.util.Scanner;

public class StringReplaceSpace {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String s = in.nextLine();
        String sNew = s.replace(" ", ",");
        System.out.println(sNew);
    }
}
