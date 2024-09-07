import java.util.*;
class Alpha{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a string:");
	String str=in.nextLine();

	char charArray[]=str.toCharArray();
	Arrays.sort(charArray);
	System.out.println("After arranging string in alphabetical order");
	System.out.print(new String(charArray));
	System.out.println();

	Scanner sc=new Scanner(System.in);
	System.out.println("To arrange list of String in alphabetical order");
	System.out.println("Enter no.of words:");
	int n=sc.nextInt();

	String words[]=new String[n];
	System.out.println("Enter words:");
	for(int i=0;i<n;i++){
	words[i]=in.nextLine();
      }
	sortAlphabet(words);
 }
	static void sortAlphabet(String words[]){
	Arrays.sort(words);
	System.out.println("After arranging list of string in alphabetical order" + Arrays.toString(words));
 }
}