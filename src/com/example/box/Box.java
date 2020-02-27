package com.example.box;

public class Box {
    int length;
    int width;
    int height;
    int area;

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
    public void calculateAreaAndShow(int l,int w,int h){
        area=l*w*h;
        System.out.println("area = "+area);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
