package com.example.box;

public class Box {
    int length;
    int width;
    int height;

    public void setDimention(int l, int w, int h){
        length=l;
        width=w;
        height=h;
    }

    public void getDimensions(){
        System.out.println("length = "+length);
        System.out.println("width = "+width);
        System.out.println("height = "+height);
    }
}
