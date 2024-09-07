import java.lang.*;
import java.util.Scanner;
class SimpleInterest{
    float P=0,R=0,T,SI=0;


    Scanner in=new Scanner(System.in);

    //Taking input from the user
    System.out.println("Enter Principle: ");
    P=in.nextFloat();

    System.out.println("Enter Rate: ");
    R=in.nextFloat();

    System.out.println("Enter Time Period: ");
    T=in.nextFloat();

    //Formula of Simple Interest
    SI=(P*R*T)/100;

    System.out.println("Simple Interest= "+SI);

}
class Wrapper{
    public static void main(String args[]){
        int a,b,c;
        a=Integer.parseInt(arg[0]);
        b=Integer.parseInt(arg[1]);
        c=a+b;
        System.out.println("Sum= "+c);
    }
   
}