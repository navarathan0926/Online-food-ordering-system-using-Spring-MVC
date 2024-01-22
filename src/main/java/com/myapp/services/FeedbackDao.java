package com.myapp.services;


import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.myapp.beans.Feedback;
import com.myapp.beans.Food;

@Service
public class FeedbackDao {

    JdbcTemplate template;

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public boolean save(Feedback feedback_tbl) {
        String sql = "INSERT INTO feedback_tbl(customer_name, phonenumber, feedback) VALUES('" + feedback_tbl.getCustomer_name() + "', '" + feedback_tbl.getPhonenumber() + "', '" + feedback_tbl.getFeedback() + "')";
        return template.update(sql) > 0;
    }
    
    
    public List<Feedback> feedbacks(){
		String sql="SELECT * FROM `feedback_tbl` group by customer_name";
		return template.query(sql, this::maptoFeedbacks);
	}
	
	private Feedback maptoFeedbacks(ResultSet rs, int i) {
		Feedback feed=new Feedback();
		try {
			feed.setCustomer_name(rs.getString("customer_name"));
			feed.setFeedback(rs.getString("feedback"));
			feed.setPhonenumber(rs.getString("phonenumber"));
			feed.setRating(rs.getFloat("rating"));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return feed;
	}
    
}