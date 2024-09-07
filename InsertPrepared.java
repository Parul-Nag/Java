import java.io.IOException;
import java.sql.*;
import java.util.*;
class InsertPrepared{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYS as SYSDBA", "123");

            PreparedStatement stmt=con.prepareStatement("insert into Student_Information values(?,?,?) ");
            
            System.out.println("Enter no. of entries/records: ");
            int n=input.nextInt();
            for(int i=0;i<n;i++){
                System.out.println("Enter Details(sname,Roll_no,Phone_no)");
                String name=input.next();
                int Rn=input.nextInt();
                long Pn=input.nextLong();

                stmt.setString(1,name);
                stmt.setInt(2,Rn);
                stmt.setLong(3, Pn);
                stmt.execute();

            }

		System.out.println("Records inserted successfully....");

            stmt.close();
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}