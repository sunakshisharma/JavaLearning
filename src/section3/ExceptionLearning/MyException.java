package section3.ExceptionLearning;

public class MyException extends Exception {
    Integer ex1;
    Integer ex2;

    MyException(Integer a, Integer b) {
        ex1 = a;
        ex2 = b;
    }

    public String toString() {
        return "Either Number " + ex1 + " or " + ex2 + " is zero";
    }

}
