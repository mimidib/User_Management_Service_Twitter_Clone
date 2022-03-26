package com.cst8277.ums;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserRepository userRepository;

    //Test webpage mapping
    @GetMapping("/welcome")
    public String showWelcome(){
        return "Welcome to User Management Service Home.";
    }

    //Get all users
    @GetMapping("/users")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    //insert a new user
    @PostMapping(path="/insertuser")//To insert a user we request the following user Entity parameters
    public @ResponseBody String insertUser( //ResponseBody refers to the return response string once completed
            @RequestParam String name,//RequestParam refers to the parameters needed to complete the GET or POST action
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam int created,
            @RequestParam int last_visit_id){
        User newuser = new User();  //create user obj
        newuser.setName(name);      //set user Obj attributes
        newuser.setEmail(email);
        newuser.setPassword(password);
        newuser.setCreated(created);
        newuser.setLast_visit_id(last_visit_id);
        userRepository.save(newuser); //save the user obj into Use Repositry
        log.info("@@@@@@@@@@@@@@@@@@Inside insertuser PostMapping @@@@@@@@@@@@@@@@@");

        return "New User Inserted into Records"; //The ResponseBody String
    }
}

