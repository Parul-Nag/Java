import java.util.*;
class Buffer{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter string1: ");
        String s1=sc.nextLine();
        StringBuffer str1=new StringBuffer(s1);

        System.out.println("Enter string2: ");
        String s2=sc.nextLine();
        StringBuffer str2=new StringBuffer(s2);
        
        StringBuffer sb1=new StringBuffer();
        sb1=str1.append(str2);
        System.out.println("After Appending ");
        System.out.println(sb1);

        StringBuffer s3=new StringBuffer();
        s3=str1.insert(3,str2);
        System.out.println("After inserting string 2 in 3rd position ");
        System.out.println(s3);

        str1.setCharAt(3,'r');
        System.out.println("After replacing 3rd character ");
        System.out.println(str1);
    }
}