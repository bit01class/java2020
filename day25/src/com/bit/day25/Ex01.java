package com.bit.day25;


import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {

	public static void main(String[] args) {
		oracle.jdbc.driver.OracleDriver driver=null;
		
		driver=new OracleDriver();
		
		java.sql.Connection conn=null;
		java.sql.Statement stmt =null;
		
//		String url="jdbc:oracle:thin:@ip:port:sid";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		java.util.Properties info=new Properties();
		info.put ("user", "scott");
		info.put ("password","tiger");
		
		try {
			conn=java.sql.DriverManager.getConnection(url, info);
			
			System.out.println("접속성공...");
			
			String sql="insert into dept (deptno,dname,loc) values (90,'임시','제주')";
//			String sql="update dept set dname='마케팅', loc='대전' where deptno=90";
//			String sql="delete from dept where deptno=90";
			
			
			stmt = conn.createStatement();
			int result=stmt.executeUpdate(sql);
			if(result>0){
				System.out.println("입력완료...");
			}else{
				System.out.println("입력실패...");
			}
		} catch (SQLException e) {
			System.out.println("접속실패...");
			e.printStackTrace();
		} finally{
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
















