package com.myapp.controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.myapp.beans.Food;
import com.myapp.beans.User;

import com.myapp.services.FoodDao;

@Controller
@RequestMapping("/food")
public class FoodController {
//	@Autowired
//	FoodDao fdao;
//	
//	
//	
//	 @RequestMapping(value = "/all", method = RequestMethod.GET)
//	    public String viewAllFoods(Model model) {
//	        List<Food> allFood = fdao.getAllFoods();
//	        model.addAttribute("allFoods", allFood);
//
//	        return "foods_page";
//	    }
//	 
//	 
//	 
//	 
//	 
//	 @RequestMapping(value = "/special", method = RequestMethod.GET)
//	    public String specialFoods( Model model) {
//		 List<Food> specialFood=fdao.specialFoods();
//	        model.addAttribute("specialFood", specialFood);
//	        
//	        List<Food> mustTryableFood=fdao.mustTryableFood();
//	        model.addAttribute("mustFood", mustTryableFood);
//	        return "home";
//	    }
	 

}


