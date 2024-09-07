class Outer{
    void test(){
        Inner in=new Inner();
        in.show();
    }
    void msg(){
        System.out.println("Hello from msg");
    }
    static class Inner{
        Outer o=new Outer();
        void show(){
            System.out.println("Hello from show"+'\n'+"I'm Static Nested class");
            o.msg();
        }
    }
}
class Nested{
    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.test();
    }
}