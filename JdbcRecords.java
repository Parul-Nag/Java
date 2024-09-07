import java.sql.*;
import java.lang.*;
class JdbcRecords{
public static void main(String s[])
{
    try
    {
    Class.forName("oracle.jdbc.driver.OracleDriver"); 
    Connection con=DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","SYS as SYSDBA","123"); 
    System.out.println("Driver loaded Successfully....");
    Statement st= con.createStatement();
    ResultSet rst=st.executeQuery(“SELECT *from Student_Information”);
    While(rst.next())
    {
    System.out.println(rst.getString(1)+rst.getInt(2)+rst.getLong(3));
    }
    rst.close();
    //St.close();
    //Con.close();
    } 
    catch(Exception e) 
    {
    System.out.println(e);
    }

}
}