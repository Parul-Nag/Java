class P{
    public void parent(){
        System.out.println("I'm Parent of all");
    }
    public void child(){
        System.out.println("This is child method of parent class");
    }
}
class C extends P{
    public void child(){
        System.out.println("I'm Independent child");
    }
}
public class Check {
    public static void main(String[] args){
        P p=new P();
        p.child();
        C c=new C();
        c.child();
        P ref=new C();
        ref.child();
    }
}
