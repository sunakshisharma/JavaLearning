package section3;

import java.util.Scanner;

public class SearchChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String a = in.nextLine();
        int sum = a.indexOf("u") + 1;
        if (sum != 0)
            System.out.println("The position of 'u' is: " + sum);
        else
            System.out.println("The position of 'u'  is not there");


//        int a = in.nextLine()a.indexof("u");
//
////        System.out.println("Index value is: " + a.indexOf("u"));
//         if (a >= 0){
//             System.out.println("Index value is u is : ");
//
//         }else {
//             System.out.println("Character 'u' not found.");

//         }
    }
}
