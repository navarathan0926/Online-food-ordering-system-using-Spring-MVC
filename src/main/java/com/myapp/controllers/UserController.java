package com.myapp.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.myapp.beans.User;
import com.myapp.services.UserDao;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserDao dao;
	
	@RequestMapping("/login")  
    public String toLogin()  
    {  
        return "login";  
    }  
	
	@RequestMapping("/reg")  
    public String toRegister()  
    {  
        return "register";  
    }  
	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public String viewAllUser(Model model) {
        List<User> allUser = dao.allUser();
        model.addAttribute("allUser", allUser);
        return "user_page";
    }

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user, Model m) {
		if(dao.save(user)) {
			m.addAttribute("msg", "Registration successfuly.");
			return "display";
		}else {
			m.addAttribute("msg", "Please try again.");
			return "display";
		}
		
	}
	

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, Model m, HttpSession session) {
		boolean loginFlag=dao.userValidation(user);
		if(loginFlag) {
			session.setAttribute("uname", user.getUsername());

			return "redirect:/food/special";
		}else {
			return "fail";
		}
		
	}
	
	 @RequestMapping(value="/logout",method = RequestMethod.GET)
     public String logout(HttpServletRequest request){
         HttpSession httpSession = request.getSession();
         httpSession.invalidate();
         return "redirect:/user/login";
     }
	

}
