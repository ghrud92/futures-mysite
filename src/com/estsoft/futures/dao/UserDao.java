package com.estsoft.futures.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.estsoft.db.DBConnection;
import com.estsoft.futures.vo.UserVo;

public class UserDao {
	private DBConnection dbConnection;
	
	public UserDao(DBConnection dbConnection){
		this.dbConnection = dbConnection;
	}
	
	public void insert(UserVo vo){
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			conn = dbConnection.getConnection();
			
			String sql = "insert into user values(null,?,?,?,now())";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getPassword());
			
			pstmt.executeUpdate();
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
	}
	
	public UserVo get(UserVo vo){
		UserVo userVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			conn = dbConnection.getConnection();
			
			String sql = "select no, name, email from user where email = ? and passwd = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getEmail());
			pstmt.setString(2, vo.getPassword());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				
				userVo = new UserVo();
				userVo.setNo(no);
				userVo.setName(name);
				userVo.setEmail(email);
			}
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			try{
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
		return userVo;
	}
	
	public UserVo get(int no){
		UserVo userVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			conn = dbConnection.getConnection();
			
			String sql = "select no, name, email from user where no = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, no);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				int userNo = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				
				userVo = new UserVo();
				userVo.setNo(userNo);
				userVo.setName(name);
				userVo.setEmail(email);
			}
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			try{
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
		return userVo;
	}
	
	public void update(UserVo vo){
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			conn = dbConnection.getConnection();
			
			if(vo.getPassword() == "" || vo.getPassword() == null){
				String sql = "update user set name = ?, email = ? where no = ?";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, vo.getName());
				pstmt.setString(2, vo.getEmail());
				pstmt.setInt(3, vo.getNo());
			}else{
				String sql = "update user set name = ?, email = ?, passwd = ? where no = ?";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, vo.getName());
				pstmt.setString(2, vo.getEmail());
				pstmt.setString(3, vo.getPassword());
				pstmt.setInt(4, vo.getNo());
			}
			
			pstmt.executeUpdate();
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
	}
}
