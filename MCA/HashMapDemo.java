import java.io.*;
import java.util.*;
public class HashMapDemo {
    public static void main(String args[]) throws IOException{
        HashMap<String,Long> hm=new HashMap<String,Long>();
        String name,str;
        Long phno;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("1. Enter Phone Entries: ");
            System.out.println("2. Lookup in the Book ");
            System.out.println("3. Display names in Book ");
            System.out.println("4. Exit ");
            int n=Integer.parseInt(br.readLine());
            switch(n){
                case 1:
                    System.out.println("Enter Name: ");
                    name=br.readLine();
                    System.out.println("Enter Phone No. :  ");
                    str=br.readLine();
                    phno=new Long(str);
                    hm.put(name,phno);
                    break;
                
                case 2:
                    System.out.println("Enter Name ");
                    name=br.readLine();
                    name=name.trim();
                    phno=hm.get(name);
                    System.out.println("Phno: "+phno);
                    break;

                case 3:
                    Set<String> set=new HashSet<String>();
                    set=hm.keySet();
                    System.out.println(set);
                    break;

                case 4:
                    return;
            }
        }
    }
}
