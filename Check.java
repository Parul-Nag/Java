import java.util.*;

class Check {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(num + " is positive number");
		} else if (num == 0) {
			System.out.println(num + " is zero");
		} else{
			System.out.println(num + " is negative number");
		}
			
		sc.close();
	}

}