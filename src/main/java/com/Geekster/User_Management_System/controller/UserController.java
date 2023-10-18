package com.Geekster.User_Management_System.controller;

import com.Geekster.User_Management_System.model.User;
import com.Geekster.User_Management_System.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public String addUser(@Valid @RequestBody User user){

        return userService.addUser(user);
    }

    @GetMapping("getUser/Id/{Id}")
  public User getUserById(@PathVariable Integer Id){

        return userService.getUserById(Id);
  }

  @GetMapping("getAllUser")
  public List<User> getAllUser(){

        return userService.getAllUser();
  }

    @PutMapping("updateUserInfo/{id}")
    public String updateUser(@PathVariable Integer id, @RequestBody User user){
        userService.updateUser(id,user);
        return "Update User" ;
    }

    @DeleteMapping("Users/delete/{ids}")
    public String removeUsersByIds(@PathVariable Integer ids){

        return userService.removeUsers(ids);
    }


}
