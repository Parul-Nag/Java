final class Document{
    void mNumber(){
        System.out.println("8787867865");
    }
    void atmPin(){
        System.out.println("8787");
    }
}
class Duplicate extends Document{
    void mNumber(){
        System.out.println("8787867865");
    }
    void atmPin(){
        System.out.println("8787");
    }
}
public class FinalExample {
    public static void main(String[] args){
        Duplicate d=new Duplicate();
        d.mNumber();
        d.atmPin();
    }
}
