package com.myapp.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.myapp.beans.Food;
import com.myapp.beans.User;


@Repository
public class FoodDao {

	@Autowired
	JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	

	public List<Food> specialFoods() {
		String sql="SELECT * FROM food_tbl WHERE special_day='"+LocalDate.now().getDayOfWeek().name()+"'";
		return template.query(sql, this::maptoFoods);
	}

	public List<Food> mustTryableFood() {
		String sql="SELECT * FROM food_tbl ORDER BY rating DESC LIMIT 4";
		return template.query(sql, this::maptoFoods);
	}
	
	public List<Food> getAllFoods(){
		String sql="SELECT * FROM food_tbl ORDER BY category DESC";
		return template.query(sql, this::maptoFoods);
	}
	

	
	private Food maptoFoods(ResultSet rs, int i) {
		Food food=new Food();
		try {
			food.setFoodName(rs.getString("food_name"));
			food.setCategory(rs.getString("category"));
			food.setPrice(rs.getDouble("price"));
			food.setImage(rs.getString("image"));
	        food.setSpecialDay(rs.getString("special_day"));
	        food.setRating(rs.getFloat("rating"));
	        food.setResponse(rs.getInt("response"));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return food;
	}
	

	
}








