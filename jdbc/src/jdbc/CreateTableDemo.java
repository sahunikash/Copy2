package jdbc;
import java.sql.*;
public class CreateTableDemo 
{
public static void main(String[] args) throws Exception
{
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String name = "nikash";
	String password = "nikash";
	String sql_query ="create table employees199311"
			+ "(eno number,"
			+ "ename varchar(10),"
			+ "esalary number(10,2)"
			+ ",eaddress varchar(20))" ;
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = DriverManager.getConnection
			(url,name,password);
	Statement st = con.createStatement();
	st.executeQuery(sql_query);
	System.out.println("created");
	con.close();
	st.close();

}
}
