import java.util.*;
class Prime{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter no. of terms: ");
       int n=sc.nextInt();
       System.out.println("Enter beginning term: ");
       int n1=sc.nextInt();
       System.out.println("Prime Number Series upto "+n+" terms:");
       check(n1,n);
       sc.close();
       
    }
    static void check(int num,int term){
        boolean f=false;
        int i;

        for(i=num;i<term;i++){
            for(int j=2;j<i;j++){
                if(i % j==0){
                    f=false;
                    break;
                }
                else{
                    f=true;
                }
               }
            
            if(f)
               System.out.print(i+", ");
        }
           
    }
}