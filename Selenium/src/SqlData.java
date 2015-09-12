import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SqlData {
    
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/northwind","root","");
	Statement stmt = (Statement) conn.createStatement();
	
	/*
	String strSelect = "select distinct city from customers";
	System.out.println(strSelect);
	ResultSet rset = stmt.executeQuery(strSelect);
	System.out.println(rset);

	while(rset.next()){
		String city = rset.getString("city");
		System.out.println(city);
	}
	*/
	
	String strSelect1 = "select productname, unitprice from Products order by unitprice";
	System.out.println(strSelect1);
	ResultSet rset1 = stmt.executeQuery(strSelect1);
	System.out.println(rset1);

	while(rset1.next()){
		String PN = rset1.getString("ProductName");
		String UP = rset1.getString("UnitPrice");
		
		System.out.print(PN);
		System.out.print(", ");
		System.out.println(UP);

	}
	
	
	}

}
