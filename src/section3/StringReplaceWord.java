package section3;

import java.util.Scanner;

public class StringReplaceWord {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = in.nextLine();
        String sNew = s.replace("hello", "");
        System.out.println("New string is: " + s +" "+ sNew);

    }
}
