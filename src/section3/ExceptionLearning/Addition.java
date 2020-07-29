package section3.ExceptionLearning;

import java.util.Scanner;

public class Addition {
    static Integer Number_1;
    static Integer Number_2;
    static Integer Sum;


    static Integer addNos(Integer a, Integer b) throws MyException {
        if (a == 0 || b == 0) {
            throw new MyException(a,b);
        }
        return a + b;

    }

    static void addNo() throws MyException{
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        Number_1 = in.nextInt();
        System.out.println("Please enter second integer: ");
        Number_2 = in.nextInt();
        if (Number_1 == 0 || Number_2 == 0) {
            throw new MyException(Number_1,Number_2);}
        Sum = Number_1 + Number_2;
        System.out.println("Sum of both the given numbers is: " + Sum);
    }

    public static void main(String[] args) {
        try {
            addNo();
        } catch (MyException e) {
            System.out.println(e);
        }

    }
}
