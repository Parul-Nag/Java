class Construct1{
    static int a=33,b=66,c=22;
    static int d;
     Construct1(){
        System.out.println("Object has created for default constructor");
        d=(a+b+c)/3;
        System.out.println("Average ="+d);
    }
     Construct1(int n1,int n2 ){
        a=n1;
        b=n2;
        System.out.println("Object has created for parameterised constructor with 2 arguments");
        d=(a+b+c)/3;
        System.out.println("Average ="+d);
    }
     Construct1(int n1,int n2,int n3){
        a=n1;
        b=n2;
        c=n3;
        System.out.println("Object has created for parameterised constructor with 3 arguments");
        d=(a+b+c)/3;
        System.out.println("Average ="+d);
    }
    
    }
    class Constructor1{
        public static void main(String[] args) {
            Construct1 c1=new Construct1();
            Construct1 c2=new Construct1(4,10);
            Construct1 c3=new Construct1(44,22,6);
    
        }
    }