package section3;

public class generics<T> {
    public static void add(int num1, int num2) {
        System.out.println("The sum is: " + (num1 + num2));
    }
    public static void main(String[]args){
        add(2,4);
    }
}
