package com.myapp.services;

import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


import com.myapp.beans.Help;
import com.myapp.beans.User;

public class HelpDao {

	@Autowired
	JdbcTemplate template;
	
	@Autowired
    private HttpSession session;
	
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	

	private Help maptoHelp(ResultSet rs, int i) {
		Help help=new Help();
		try {
			help.setMsg_id(rs.getInt("msg_id"));
			help.setUser_id(rs.getInt("user_id"));
			help.setUser_name(rs.getString("user_name"));
			help.setMessage(rs.getString("message"));
			help.setReply(rs.getString("reply"));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return help;
	}
	
	public List<Help> helpUser(){
		String name = (String) session.getAttribute("uname");
		String sql="SELECT * FROM help WHERE  user_name='"+name+"'";
		return template.query(sql, this::maptoHelp);
	}
	
	public boolean askHelp(Help help) {
		String name = (String) session.getAttribute("uname");
		String sql = "INSERT INTO help(user_name, message) VALUES('"+name+"','"+help.getMessage()+"')";
		int a = template.update(sql);
		return a > 0;
	}
}
