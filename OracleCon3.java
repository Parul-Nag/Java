import java.io.IOException;
import java.sql.*;
class OracleCon3{
    public static void main(String[] args) throws Exception{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYS as SYSDBA", "123");
            System.out.println("Driver loaded Successfully....");

            Statement stmt=con.createStatement();
            stmt.execute("create table Student_Information(Sname varchar2(15),Roll_no number(3) primary Key,Phone_no number(10))");
            System.out.println("Table Created");

            stmt.close();
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}