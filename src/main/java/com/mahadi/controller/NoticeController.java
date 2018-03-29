package com.mahadi.controller;

import com.mahadi.dao.Notice;
import com.mahadi.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Mahadi on 10/17/2017.
 */

@Controller
public class NoticeController {

   private NoticeService noticeService;

   @Autowired
   public void setNoticeService(NoticeService noticeService) {
        this.noticeService = noticeService;
   }

   @RequestMapping("/test")
   public String showTest(Model model, @RequestParam("id") String id){
       System.out.println("ID is " + id);
       return "home";
   }

//   @ExceptionHandler(DataAccessException.class)
//   public String handleDatabaseException(DataAccessException ex){
//       return "error";
//   }

   @RequestMapping("/notices")
   public String showNotices(Model model){
       noticeService.throwTestException();
       List<Notice> notices = noticeService.getCurrent();
       model.addAttribute("notices", notices);
       return "notices";
   }

   @RequestMapping("/createnotices")
   public String createNotices(Model model){
       model.addAttribute(new Notice());
       return "createnotices";
   }

   @RequestMapping( value = "/docreated", method = RequestMethod.POST)
   public String doCreate(Model model, @Valid Notice notice, BindingResult result){

       if (result.hasErrors()){
           return "createnotices";
       }

       noticeService.create(notice);
       return "noticecreated";

   }
}
