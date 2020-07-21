package section3;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String s = in.nextLine();

        for(int i=1; i<= s.length(); i++){
            System.out.print(s.toUpperCase().charAt(i-1)+"-"+i);
            if(i != s.length()){
                System.out.print(",");
            }
        }

    }
}