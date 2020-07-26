package javalearnings;

public class Square {
    Integer Side;
    Integer AreaOfSquare;

    public void setSide(Integer side){
        Side = side;
    }
    public Integer getSide(){
        return Side;
    }
    public Integer getAreaOfSquare(){
        return AreaOfSquare;
    }

    public void SquareArea(Integer side){
        AreaOfSquare = side * side;
    }

}
