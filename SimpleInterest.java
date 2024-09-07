import java.util.Scanner;

class SimpleInterest {
    public static void main(String arg[]) {

        float P, R, T, SI = 0;

        Scanner in = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter Principle: ");
        P = in.nextFloat();

        System.out.println("Enter Rate: ");
        R = in.nextFloat();

        System.out.println("Enter Time Period: ");
        T = in.nextFloat();

        // Formula of Simple Interest
        SI = (P * R * T) / 100;

        System.out.println("Simple Interest= " + SI);
        in.close();
    }

}
