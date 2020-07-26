package javalearnings;

public class Triangle {

    Integer Base;
    Integer Height;
    Float AreaOfTriangle;

    public void setBase(Integer base){
        Base = base;
    }
    public void setHeight(Integer height){
        Height = height;
    }
    public Integer getBase(){
        return Base;
    }
    public Integer getHeight(){
        return Height;
    }
    public Float getAreaOfTriangle(){
        return AreaOfTriangle;
    }

    public void CalculateArea(Integer base, Integer height){
        AreaOfTriangle = (float) 1/2 * (base * height);
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.CalculateArea(50,20);
        System.out.println(triangle1.getAreaOfTriangle());

        Triangle triangle2 = new Triangle();
        triangle2.CalculateArea(20,30);
        System.out.println(triangle2.getAreaOfTriangle());

        Square Square1 = new Square();
        Square1.SquareArea(20);
        System.out.println(Square1.getAreaOfSquare());


    }
}
