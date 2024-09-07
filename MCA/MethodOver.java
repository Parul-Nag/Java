class Method{
    public void m1(int a){
        System.out.println("int method");
    }
    public void m1(float b){
        System.out.println("float method");
    }
}
class MethodOver {
    public static void main(String[] args){
        Method obj=new Method();
        obj.m1(10);
        obj.m1(10.5f);
        obj.m1('a');
        obj.m1(11.5f);
    }
}

