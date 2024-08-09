package com.curso.springboot.webapp.springboot_web.controllers;



import java.util.List;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Waldo","Gomez");
        model.addAttribute("title", "Hola mundo springboot");
        model.addAttribute("user", user);
        
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        model.addAttribute("title", "lista de usuarios");
        // model.addAttribute("users", users);

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(new User("Waldo", "Gomez"),
        new User("Waldo2","Gomez2"),
        new User("Waldo3","Gomez3", "waldo@gmail.com"),
        new User("Waldo4","Gomez4"));
       
    }
    

}
