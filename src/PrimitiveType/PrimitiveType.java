package PrimitiveType;

import java.awt.*;

public class PrimitiveType {

    public static void main(String[] args) {
        Point point1 = new Point(10,13);
        Point point2 = point1;
        point1.x = 20;
        String message = "Hello World" + "!!";

        System.out.println("the value of point2 is: " +point2);
        System.out.println(message.length());




    }
}
