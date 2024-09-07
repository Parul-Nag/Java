import java.util.*;
class Factorial{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter any number:");
      int n=sc.nextInt();

      facto(n);
    }
    static public void facto(int num){
        long f=1;

        for(int i=num;i>0;i--){
            f *=i;
        }
        System.out.println("Factorial of "+num+ "=" +f);
    }
}