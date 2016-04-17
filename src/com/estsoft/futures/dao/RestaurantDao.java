package com.estsoft.futures.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.estsoft.db.DBConnection;
import com.estsoft.futures.vo.RestaurantVo;

public class RestaurantDao {
	private DBConnection dbConnection;
	
	public RestaurantDao(DBConnection dbConnection){
		this.dbConnection = dbConnection;
	}

	public List<RestaurantVo> getList(){
		List<RestaurantVo> list = new ArrayList<RestaurantVo>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			conn = dbConnection.getConnection();
			
			String sql = "select no, name, img from restaurant";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String img = rs.getString(3);
				
				RestaurantVo vo = new RestaurantVo();
				vo.setNo(no);
				vo.setName(name);
				vo.setImg(img);
				
				list.add(vo);
			}
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}finally{
			try{
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
		
		return list;
	}
}
