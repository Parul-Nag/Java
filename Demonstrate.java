import java.util.*;
class Demonstrate{
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      
      System.out.println("Enter a lucky number from 1 to 7...and grab the offer  ..! Good luck..");
      System.out.println("Enter ur choice: ");
      int c=in.nextInt();

      switch (c) {
        case 1:
            System.out.println("Congo..You get (Shirt + Joggers + t-shirt) in just 1500");
            break;
        case 2:
            System.out.println("Congo..You get (crop top + navy blue jeans + earring 1set) in just 1355");
            break;
        case 3:
            System.out.println("Ooops.. better luck next time");
            break;
        case 4:
            System.out.println("Congo..You get (Sweat shirt + 2-t-shirt) in just 999");
            break;   
        case 5:
            System.out.println("Congo..You get (Saree + 2-Kurtis) in just 1200");
            break; 
        case 6:
            System.out.println("Null..Sorry bad luck");
            break;
        case 7:
            System.out.println("Congo..You get (Sweat shirt + ankle length black jeans + 2-t-shirt) in just 1999");
            break;
        default:
           System.out.println("Wrong number...");
            break;
      }
      Demo(c);

    }
    public static void Demo(int a){
        System.out.println("For Continue You'll now skip that number you had choose");
        for (int i=1; i<=7;i++){
            if (i == a)
            continue;
           System.out.println(i);
        }
        
    }
    
}