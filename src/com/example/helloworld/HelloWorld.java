package com.example.helloworld;

import com.example.box.Box;

public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Box obj = new Box();
        obj.setDimention(1,2,3);
        obj.getDimensions();
        obj.calculateAreaAndShow(obj.getLength(),obj.getWidth(),obj.getHeight());
    }
}
