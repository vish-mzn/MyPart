package com.objectified.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.objectified.dto.Batch;

public class AddBatchDBUtil
{
	final static String url = "com.mysql.jdbc.Driver";
	final static String user = "root";
	final static String password = "root";
	
	public static void addBatch(Batch batch) throws ClassNotFoundException, SQLException
	{
		Class.forName(url);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/objectified", user, password);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO batch VALUES(?, ?, ?, ?)");
		ps.setString(1, batch.getId());
		ps.setString(2, batch.getCourseId());
		ps.setDate(3, batch.getDate());
		ps.setInt(4, 12);
		
		ps.executeUpdate();
	}
}
