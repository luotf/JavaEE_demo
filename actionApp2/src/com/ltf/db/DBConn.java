package com.ltf.db;
import java.sql.*;
public class DBConn{
	public static Connection conn;			//Connection对象（连接）
	//获取数据库连接
	public static Connection getConn(){
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			/**编写连接字符串，创建并获取连接*/
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_ssh","root","3306");
			return conn;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//关闭连接
	public static void CloseConn(){
		try{
			conn.close();					//关闭连接
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
