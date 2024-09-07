import java.util.*;
class DemoOperator{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Arithmetic Operator");
	int a=55;
	int b=10;
	int c;
	c=a+b;
	System.out.println("Sum of number= "+ c);
	c=a-b;
	System.out.println("Subtraction of number= "+ c);
	c=a*b;
	System.out.println("Product of number= "+ c);
	System.out.println("Assignment Operator");
	int sum=0;
	for(int i=1;i<=10;i++){
	sum +=i;
	}
	System.out.println("Sum of 10 number= "+ sum);
	System.out.println("Use of Logical Operator &&,|| and Relational operator ==");
	System.out.print("Enter year to check leap:");
	int year=sc.nextInt();
	if(year % 400==0 && year % 100 !=0 || year % 4==0){
		System.out.println(year + " is leap year");
		}
	else
		System.out.println(year + " is not a leap year");

	System.out.println("Use of Bitwise operator");
	System.out.println("a & b="+ a & b);
	System.out.println("a>>="+ a>>1);

 }
}