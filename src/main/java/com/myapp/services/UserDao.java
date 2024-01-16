package com.myapp.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.myapp.beans.Food;
import com.myapp.beans.User;

import com.myapp.beans.User;
import com.myapp.services.UserDao;

public class UserDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public boolean save(User user) {
		String sql = "INSERT INTO user_tbl(user_name, phone_no, email, password, user_type) VALUES ('"
				+ user.getUsername() + "', '" + user.getMobile() + "', '" + user.getEmail() + "', '"
				+ user.getPassword() + "', '" + user.getUser_type() + "')";
		int a = template.update(sql);
		return a > 0;
	}

	public boolean userValidation(User user) {
		String sql2 = "SELECT count(*) from user_tbl where user_name=? and password=?";
		int count = template.queryForObject(sql2, Integer.class, user.getUsername(), user.getPassword());
		if (count == 1) {
			return true;
		} else {
			return false;
		}

	}

	public List<User> allUser(){
		String sql="SELECT * FROM user_tbl";
		return template.query(sql, this::maptoUsers);
	}
	
	private User maptoUsers(ResultSet rs, int i) {
		User user=new User();
		try {
			user.setUsername(rs.getString("user_name"));
			user.setEmail(rs.getString("email"));
			user.setUser_id(rs.getInt("user_id"));
			user.setMobile(rs.getString("phone_no"));
			user.setPassword(rs.getString("password"));
			user.setUser_type(rs.getString("user_type"));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return user;
	}
	
//	---------------------------------------------------
//	public User getUserByUsername(String username) {
//        String sql = "SELECT * FROM users WHERE username = ?";
//        try {
//            ResultSet rs = template.queryForResultSet(sql, new Object[] {username});
//            if (rs.next()) {
//                User user = new User();
//                user.setUsername(rs.getString("username"));
//                user.setPassword(rs.getString("password"));
//                //set other columns as well
//                return user;
//            }
//        } catch (SQLException e) {
//            // handle the exception
//        }
//        return null;
//    }
	
	
	
	
//	-----------------------------------------------------

}
