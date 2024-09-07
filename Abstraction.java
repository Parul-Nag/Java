abstract class Figures{
    abstract void Area( );
}
class Rectangle extends Figures{
    void Area(){
        int len=200,br=5;
        int Result=len*br;
        System.out.println("Area of Rectangle= "+Result);
    }
}
class Square extends Figures{
    void Area(){
        int a=9;
        int Result=a*a;
        System.out.println("Area of Square= "+Result);
    }
}
class Circle extends Figures{
    void Area(){
        int r=3;
        double Result=3.14*r*r;
        System.out.println("Area of Circle= "+Result);
    }
}
class Cylinder extends Figures{
    void Area(){
        int r=6;int h=8;
        double Result=3.14*r*r*h;
        System.out.println("Area of Cylinder= "+Result);
    }
}
class Abstraction{
    public static void main(String[] args) {
        Figures R=new Rectangle();
        R.Area();
        Figures S=new Square();
        S.Area();
        Figures C=new Circle();
        C.Area();
        Figures C1=new Cylinder();
        C1.Area();
    }
}