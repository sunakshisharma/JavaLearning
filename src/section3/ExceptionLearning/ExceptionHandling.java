package section3.ExceptionLearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        try {
            Integer s = in.nextInt();
            Integer a = s / 0;
            System.out.println(a);
        } catch (InputMismatchException ex) {
            System.out.println("Please enter Integer number: " );
            ex.printStackTrace();
        } catch (ArithmeticException ex) {
            System.out.println("Number provided can not divide by zero. ");
            ex.printStackTrace();
        }


    }
}
