package com.ltf.dao;
import java.sql.*;
import com.ltf.db.DBConn;
import com.ltf.model.User;
public class UserDao {
	Connection conn;											//数据库连接对象
	public User checkLogin(String username, String password){		//验证登录用户名和密码
		try{
			conn = DBConn.getConn();							//获取连接对象
			PreparedStatement pstmt = conn.prepareStatement("select * from tb_user where username=? " + "and password=?");
			pstmt.setString(1, username);							//设置 SQL 语句参数1（用户名）
			pstmt.setString(2, password);						//设置 SQL 语句参数2（密码）
			ResultSet rs = pstmt.executeQuery();				//执行查询，返回结果集
			if(rs.next()){										//返回结果不为空，表示有此用户信息
				User user = new User();						//通过JavaBean对象保存值
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				return user;									//返回已经设值的JavaBean对象
			}
			return null;										//无此用户，验证失败，返回null
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			DBConn.CloseConn();									//关闭连接
		}

	}
	
	/**
	 * 注册
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean Regis(String username, String password){		//登录用户名和密码
		try{
			conn = DBConn.getConn();							//获取连接对象
			PreparedStatement pstmt = conn.prepareStatement("insert into tb_user (username,password)"
				+ "values(?,?)");
			pstmt.setString(1, username);							//设置 SQL 语句参数1（用户名）
			pstmt.setString(2, password);						//设置 SQL 语句参数2（密码）
			int i = pstmt.executeUpdate();			//返回结果集
			if(i>0){										
				return true;									
			}
			return false;										
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			DBConn.CloseConn();									//关闭连接
		}
		
		
		
	}
}
