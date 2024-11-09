package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getallemployees2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,user,password;
	driver="com.mysql.cj.jdbc.Driver";
	url = "jdbc:mysql://localhost:3306/db123";
	user = "root";
	password = "Sairam@1439";
	String selectQuary ="select * from student where id =108";
	// loading draiver
	Class.forName(driver);//loading driver is optional from java 1.6 jdbc 4.8 verssion
	//establish connection
	Connection con= DriverManager.getConnection(url,user,password);
	//create Statement object
	Statement st=con.createStatement();// it act as a vechile i carry the data from java to data base
	// process query (select)
	ResultSet rs=st.executeQuery(selectQuary);
	while(rs.next()) {
		System.out.println(rs.getInt("id"));
		System.out.println(rs.getString("Studentname"));
		System.out.println(rs.getString("email"));
		System.out.println(rs.getString("adress"));
		System.out.println(rs.getLong("mobile"));
		}
	//close the resources and connections
	rs.close();
	st.close();
	con.close();
	
}
}
