package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class OperationsOnTableData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,user,password,url;
	driver="com.mysql.cj.jdbc.Driver";
	url="jdbc:mysql://localhost:3306/db123";
	user="root";
	password="Sairam@1439";
	String quary,quary1,quary2,quary3,quary4;
	quary="select * from student";
	quary1="delete from student where id=?";
	quary2="update student set id=?,mobile=?,Studentname=?,email=?,adress=? where id=?";
	quary3="insert into student values(?,?,?,?,?)";
	
	
	Scanner sc=new Scanner(System.in);
	Class.forName(driver);
    Connection con=DriverManager.getConnection(url,user,password);
    Statement st1=con.createStatement();
	
	int option;
	do {
		System.out.println("1. show table data");
		System.out.println("2. delete student data");
		System.out.println("3. update student data");
		System.out.println("4. insert new student data");
		System.out.println("5. show student data");
		System.out.println("0 for exit");
		System.out.println("Please choose option: ");
		option = sc.nextInt();
		
		switch (option) {
		
			case 1:
				ResultSet rs=st1.executeQuery(quary);
				while(rs.next()) {
					
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("Studentname"));
					System.out.println(rs.getString("email"));
					System.out.println(rs.getString("adress"));
					System.out.println(rs.getLong("mobile"));
					System.out.println("-----------------------------------------");
					}
				break;
			case 2:
				System.out.println("enter new id no");
				int id6=sc.nextInt();
				PreparedStatement st7=con.prepareStatement(quary1);
				st7.setInt(1, id6);
				int status=st7.executeUpdate();
				if(status>=1) {
					System.out.println("success");
				}else {
					System.out.println("invalid");
				}
				break;
			case 3:
				System.out.println("enter new id no");
				int id1=sc.nextInt();
				System.out.println("enter new name");
				String name=sc.next();
				System.out.println("enter email");
				String email=sc.next();
				System.out.println("enter address");
				String address=sc.next();
				System.out.println("enter mobile no");
				long mobile=sc.nextLong();
				System.out.println("enter old id");
				int id2=sc.nextInt();
				
				PreparedStatement st3=con.prepareStatement(quary2);
				st3.setInt(1, id1);
				st3.setLong(2,mobile);
				st3.setString(3, name);
				st3.setString(4, email);
				st3.setString(5, address);
				st3.setInt(6, id2);
				int status1=st3.executeUpdate();
				if(status1>=1) {
					System.out.println("success");
				}else {
					System.out.println("invalid");
				}
				break;
			case 4:
				System.out.println("enter new id no");
				int id3=sc.nextInt();
				System.out.println("enter new name");
				String name1=sc.next();
				System.out.println("enter email");
				String email1=sc.next();
				System.out.println("enter address");
				String address1=sc.next();
				System.out.println("enter mobile no");
				long mobile1=sc.nextLong();
				
				PreparedStatement st5=con.prepareStatement(quary3);
				st5.setInt(1, id3);
				st5.setString(2,name1);
				st5.setString(3, email1);
				st5.setString(4, address1);
				st5.setLong(5, mobile1);
				int status6=st5.executeUpdate();
				if(status6>=1) {
					System.out.println("success");
				}else {
					System.out.println("invalid");
				}
				break;
			case 5:
				System.out.println("enter id value");
				int idvalue=sc.nextInt();
				quary4="select * from student where id= " +idvalue;
				Statement st2=con.createStatement();
				ResultSet rs19=st2.executeQuery(quary4);
				while(rs19.next()) {
					
					System.out.println(rs19.getInt("id"));
					System.out.println(rs19.getString("Studentname"));
					System.out.println(rs19.getString("email"));
					System.out.println(rs19.getString("adress"));
					System.out.println(rs19.getLong("mobile"));
					System.out.println("-----------------------------------------");
					}
				break;
			}
	}while(option!=0);
}
}
