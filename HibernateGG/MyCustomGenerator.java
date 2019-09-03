package edu.jspiders.hibernategg.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyCustomGenerator implements IdentifierGenerator
{

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) 
			throws HibernateException 
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hehm15_db?user=root&password=root");
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("select max(student_id) from student_info");
			
			if(rs.next())
				return rs.getInt(1)+2;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return 1;
	}
}
