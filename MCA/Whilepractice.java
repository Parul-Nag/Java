import java.util.Scanner;
public class Whilepractice {
    public static void main(String args[]){
        int sum=0,number;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=in.nextInt();

        while(number>=0){
            sum += number;

            number--;
        }
        System.out.println("Sum= "+sum);
        in.close();
    }
}
