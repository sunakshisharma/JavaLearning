package section3;

import java.util.Arrays;
import java.util.Scanner;

public class StringIntoArray {
    public static void main(String[] args){
        int size = 2;

        String[] arrOfStr = new String[size];
        Scanner in = new Scanner(System.in);
        for (int i=1;i<=size;i++) {

            System.out.println("Enter the string" + i );

            arrOfStr[i-1]= in.nextLine();
        }
        System.out.println(Arrays.toString(arrOfStr));
        Arrays.sort(arrOfStr);
        System.out.println(Arrays.toString(arrOfStr));

    }
}
