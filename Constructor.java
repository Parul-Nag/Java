class Construct{
static int a=33,b=66,c=22;
static int d;
 Construct(){
    System.out.println("Object has created for default constructor");
    d=(a+b+c)/3;
    System.out.println("Average ="+d);
}
 Construct(int n1,int n2 ){
    a=n1;
    b=n2;
    System.out.println("Object has created for parameterised constructor with 2 arguments");
    d=(a+b+c)/3;
    System.out.println("Average ="+d);
}
 Construct(int n1,int n2,int n3){
    a=n1;
    b=n2;
    c=n3;
    System.out.println("Object has created for parameterised constructor with 3 arguments");
    d=(a+b+c)/3;
    System.out.println("Average ="+d);
}

}
class Constructor{
    public static void main(String[] args) {
        Construct c1=new Construct();
        Construct c2=new Construct(4,10);
        Construct c3=new Construct(44,22,6);

    }
}