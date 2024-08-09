package com.curso.springboot.webapp.springboot_web.controllers;




import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.webapp.springboot_web.models.User;
import com.curso.springboot.webapp.springboot_web.models.DTO.UserDTO;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/restdetails")
    public UserDTO details(){
     
        UserDTO userDTO = new UserDTO("Hola mundo spring boot","Waldo","Gomez");

        
        
        return userDTO;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Waldo","Gomez");
        User user2 = new User("Waldo2","Gomez2");
        User user3 = new User("Waldo3","Gomez3");

        List<User> users = Arrays.asList(user, user2,user3);
        

        return users;
    }

    @GetMapping("/restdetails-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Waldo","Gomez");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo spring boot");
        body.put("user", user);
       
        
        return body;
    }

}
