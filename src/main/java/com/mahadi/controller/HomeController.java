package com.mahadi.controller;

import com.mahadi.dao.Notice;
import com.mahadi.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by Mahadi on 10/10/2017.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }

//    @RequestMapping(value = "/")
//    public ModelAndView home(){
//        ModelAndView modelAndView = new ModelAndView("home");
//        Map<String, Object> model = modelAndView.getModel();
//        model.put("name", "Mahadi");
//        return modelAndView;
//    }


}
