import java.lang.*;
import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        String str;
        String reverse="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        str=sc.nextLine();

        int length=str.length();

    for(int i=length-1;i>=0;i--){
        reverse= reverse+str.charAt(i);
}
    if(str.toLowerCase().equals(reverse.toLowerCase())){
        System.out.println(str + " is palindrome string");
    }
    else{
        System.out.println(str + " is not palindrome string");
    }
    }
}