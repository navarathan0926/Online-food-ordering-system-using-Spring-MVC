package com.myapp.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myapp.beans.Feedback;
import com.myapp.services.FeedbackDao;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    FeedbackDao feedbackDao;
    
    @RequestMapping("/feed")  
    public String redirect()  
    {  
        return "feedback";  
    }  

    @RequestMapping(value = "/sent", method = RequestMethod.POST)
    public String saveFeedback(@ModelAttribute("feedback_tbl") Feedback feedback_tbl, Model model) {
        if (feedbackDao.save(feedback_tbl)) {
            model.addAttribute("msg", "Feedback Successfully added!");
        } else {
            model.addAttribute("msg", "Error occurred. Please try again");
        }
        return "display";
    }
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String viewFeedback(Model model) {
        List<Feedback> feedbacks = feedbackDao.feedbacks();
        model.addAttribute("feedbacks", feedbacks);
        return "aboutUs";
    }
}