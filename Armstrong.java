import java.util.*;
import java.lang.*;
class Armstrong{
    public static void main(String[] args) {
        int i=1;
        int sum=0;
    Scanner input=new Scanner(System.in);

    System.out.println("Enter any number:");
    int n=input.nextInt();

     int test=n;
     while(n>0){
      int r=n%10;
      sum +=Math.pow(r, 3);
      n=n/10;
     }
     if(test==sum){
         System.out.println(test + " is an Armstrong Number");
        }
     else{
        System.out.println(test + " is not an Armstrong Number");
        }
    }

}