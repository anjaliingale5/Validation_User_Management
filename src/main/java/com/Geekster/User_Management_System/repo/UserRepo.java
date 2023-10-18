package com.Geekster.User_Management_System.repo;

import com.Geekster.User_Management_System.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo  extends CrudRepository<User, Integer>{
}
