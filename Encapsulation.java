import java.util.*;
class Circle{
    private double radius;
    public double result;
    public void setData(double x){
        radius=x;
    }
    public double getData(){
        return radius;
    }
    public double getResult(){
        result=3.14*radius*radius;
        return result;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Circle r=new Circle();
        r.setData(5);
        System.out.println("Radius= "+ r.getData());
        System.out.println("Area of Circle= "+ r.getResult());
    }
}