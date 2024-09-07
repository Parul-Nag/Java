import java.util.*;
interface A{
    void Name(int n1);
}
interface B{
    Void Price(int n1);
}
class BooksTotal implements A,B{
    Scanner inp=new Scanner(System.in);
    public void getName(int n1){
        for(int i=0;i<=n1;i++){
            String book=inp.nextLine();
        }
    }
    public void getPrice(int n1){
        for(int i=0;i<=n1;i++){
            int cost=inp.nextInt();
        }
    }
}
class Main{
    public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);

        System.out.println("Enter no. of Books: ");
        int n=input.nextInt();
        System.out.println("Enter names of Books:");

    }
}