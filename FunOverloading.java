class Fun{
    public int side;
    public float radius, height1;
    public float len,br,height;
    public double Volume(int side){
        return side*side*side;
        
    }
    public double Volume(double radius,double height1){
        return 3.14*radius*radius*height1;
    }
    public double Volume(float len,float br,float height){
        return len*br*height;
    }
}
class FunOverloading{
    public static void main(String[] args) {
        Fun f=new Fun();
        System.out.println("Volume of Cube= "+f.Volume(5));
        System.out.println("Volume of Cylinder= "+f.Volume(5,6.5));
        System.out.println("Volume of Cube= "+f.Volume(4,2,3));
    }
}