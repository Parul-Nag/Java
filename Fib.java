import java.util.*;
import java.lang.*;
class Arm{
 public static void main(String[] args){
 int i=1;
 int sum=0;
 Scanner in=new Scanner(System.in);
 System.out.println("Enter any number:");
 int n=in.nextInt();
 int test=n;
 while(n>0){
   int r=n%10;
   sum +=Math.pow(r,3);
   n=n/10;
  }
 if (test==sum){
   System.out.println(test + "is an Armstrong number");
  }
 else
   System.out.println(test + "is not an Armstrong number");
 }
}