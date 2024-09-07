import java.util.Scanner;
class Max{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        // int num1=50, num2=50, num3=50;
        
        if( num1>num2 && num1>num3){
            System.out.printf(num1+ " is biggest of all");
        }
        else if(num2>num1 && num2>num3){
            System.out.printf(num2+ " is biggest of all");
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3+ " is biggest of all");
        }
        else{
            System.out.println("All numbers are Equals");
        }

        in.close();
    }
}