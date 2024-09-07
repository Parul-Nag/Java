package mypack;
import university.*;
import java.util.Scanner; 
public class PackageExample{  
      public static void main(String args[]) throws Exception{  
                Scanner Obj = new Scanner(System.in);  
                System.out.print("Kindly Enter Your UserName :");  
                String sName = Obj.nextLine();  

                System.out.println("UserName is: " + sName); 
                Obj.close();
                
                WelcomeMessage m=new WelcomeMessage();
                m.ShowMessage();
                //Without importing java.net package use complete qualified name to access the class InetAddress
                java.net.InetAddress ipAddress=java.net.InetAddress.getLocalHost();  
                System.out.println("My IP Address :"+ipAddress.getHostAddress());                     

        }  

}  