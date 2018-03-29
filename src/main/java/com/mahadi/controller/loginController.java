package com.mahadi.controller;

import com.mahadi.dao.Notice;
import com.mahadi.dao.User;
import com.mahadi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Mahadi on 11/1/2017.
 */
@Controller
public class loginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login")
    public String showLogin(){
        return "login";
    }

    @RequestMapping(value = "/loggedout")
    public String showLoggedout(){
        return "loggedout";
    }

    @RequestMapping(value = "/newaccount")
    public String showNewAccount(Model model){
        model.addAttribute("user", new User());
        return "newaccount";
    }

    @RequestMapping(value = "/admin")
    public String showAdmin(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "admin";
    }

    @RequestMapping(value = "/denied")
    public String showDenied(){
        return "denied";
    }

    @RequestMapping( value = "/createaccount", method = RequestMethod.POST)
    public String doCreate(@Valid User user, BindingResult result){

        if (result.hasErrors()){
            return "newaccount";
        }

        if (userService.exits(user.getUsername())){
            result.rejectValue("username", "DuplicateKey.user.username","This username already exits. Please Choose Diffident Name. ");
            return "newaccount";
        }
        user.setAuthority("ROLE_USER");
        user.setEnabled(true);

        try {
            userService.create(user);
        }catch (DuplicateKeyException e){
            result.rejectValue("username", "DuplicateKey.user.username","This username already exits");
            return "newaccount";
        }
        return "accountcreated";

    }
}
