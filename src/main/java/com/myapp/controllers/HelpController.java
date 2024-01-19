package com.myapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.myapp.beans.Food;
import com.myapp.beans.Help;
import com.myapp.beans.User;
import com.myapp.services.HelpDao;

@Controller
@RequestMapping("/help")
public class HelpController {

	@Autowired
	HelpDao helpDao;
	
	
	@RequestMapping(value = "/inf", method = RequestMethod.GET)
    public String viewMessage(Model model) {
        List<Help> helping = helpDao.helpUser();
        model.addAttribute("helping", helping);
        return "help";
    }
	
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public String register(@ModelAttribute("help") Help help, Model m) {
		if(helpDao.askHelp(help)) {
			m.addAttribute("msg", "Message sent.");
			return "redirect:/help/inf";
		}else {
			m.addAttribute("msg", "Please try again.");
			return "redirect:/help/inf";
		}
		
	}
}


