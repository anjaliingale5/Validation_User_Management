package com.Geekster.User_Management_System.service;

import com.Geekster.User_Management_System.model.User;
import com.Geekster.User_Management_System.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String addUser(User user) {

    userRepo.save(user);

    return "Added";
    }


    public User getUserById(Integer Id) {

     return  userRepo.findById(Id).get();
    }

    public List<User> getAllUser() {

        return (List<User>) userRepo.findAll();
    }

    public void updateUser(Integer id, User user) {

        boolean user1 = userRepo.existsById(id);
        if(user1){
            userRepo.save(user);
        }
    }

    public String removeUsers(Integer ids) {

        userRepo.deleteById(ids);
        return "removed Users";
    }
}

