package com.bit.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


import oracle.jdbc.driver.OracleDriver;

public class Ex02 {

	public static void main(String[] args) {
		OracleDriver driver=null;
		driver=new OracleDriver();

		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Properties info=new Properties();
		info.setProperty("user", "scott");
		info.setProperty("password", "tiger");
		String sql="select * from dept";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection(url, info);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
			System.out.print(rs.getObject(1)+"\t");
			System.out.print(rs.getObject(2)+"\t");
			System.out.println(rs.getObject(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}

















