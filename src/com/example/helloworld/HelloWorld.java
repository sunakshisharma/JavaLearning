package com.example.helloworld;

import com.example.box.Box;

import java.text.DecimalFormat;

public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Box obj = new Box();
        obj.setDimention(1,2,3);
        obj.getDimensions();
        obj.calculateAreaAndShow(obj.getLength(),obj.getWidth(),obj.getHeight());

        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println(df.format(12.8888888));

    }
}
