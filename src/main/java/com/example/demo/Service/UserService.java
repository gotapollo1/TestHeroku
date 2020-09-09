package com.example.demo.Service;

import com.example.demo.Model.User2;
import com.example.demo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User2> getAll() {

        return userRepo.findAll();
    }

    public User2 saveUser2(User2 user2) {

        return userRepo.save(user2);
    }

    public User2 getUserByName(String name) {

        return userRepo.findByName(name);
    }

    public String deleteUser(int id) {
        userRepo.deleteById(id);
        return "User Remove!!" + id;
    }

    public User2 updateUser(User2 user2) {

            User2 existingUser = userRepo.findById(user2.getId()).orElse(null);
            existingUser.setName(user2.getName());
            existingUser.setLastname(user2.getLastname());
            existingUser.setPhone(user2.getPhone());
            return userRepo.save(existingUser);
    }
}
