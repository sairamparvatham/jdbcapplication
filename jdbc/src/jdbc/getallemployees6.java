package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class getallemployees6 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,user,password;
	driver="com.mysql.cj.jdbc.Driver";
	url = "jdbc:mysql://localhost:3306/db123";
	user = "root";
	password = "Sairam@1439";
	String selectQuary ="delete from student where id=1";
	String selectQuary1 ="select * from student";

	// loading driver
	Class.forName(driver);//loading driver is optional from java 1.6 jdbc 4.8 verssion
	//establish connection
	Connection con= DriverManager.getConnection(url,user,password);
	//create prepareStatement method
	PreparedStatement st=con.prepareStatement(selectQuary);
	Statement st1=con.createStatement();
	int status=st.executeUpdate();
	if(status>=1) {
		System.out.println("success");
	}else {
		System.out.println("invalid");
	}
	
	ResultSet rs=st1.executeQuery(selectQuary1);
	while(rs.next()) {
		System.out.println(rs.getInt("id"));
		System.out.println(rs.getString("Studentname"));
		System.out.println(rs.getString("email"));
		System.out.println(rs.getString("adress"));
		System.out.println(rs.getLong("mobile"));
		System.out.println("-----------------------------------------");
		}
	rs.close();
	st.close();
	con.close();
}
}
