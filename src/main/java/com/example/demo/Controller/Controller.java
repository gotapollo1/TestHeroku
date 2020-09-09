package com.example.demo.Controller;

import com.example.demo.Model.Product;
import com.example.demo.Model.User2;
import com.example.demo.Repository.UserProduct_Repository;
import com.example.demo.Service.ProductService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Model.userProduct;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private UserService service;
    @Autowired
    private ProductService Pservice;
    @Autowired
    private UserProduct_Repository userProductRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addUser")
    public User2 addUser(@RequestBody User2 user2) {
        return service.saveUser2(user2);
    }

    @GetMapping("/user")
    public List<User2> findAllUser() {

        return service.getAll();
    }

    @GetMapping("/userId/")
    public Optional<User2> findUserById(Integer id) {
        return null;
    }

    @GetMapping("/user/{name}")
    public User2 findUserByName(@PathVariable String name) {

        return service.getUserByName(name);
    }

    @PutMapping("/update")
    public User2 updateUser(@RequestBody User2 user2) {

        return service.updateUser(user2);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }
    @GetMapping("/allProduct")
    public List<Product> findAllProduct(){
       return Pservice.getAllProduct();
    }
    @GetMapping("/user/product")
    public List<userProduct> getUserProduct(){
        return userProductRepository.findAll();
    }
    @GetMapping("/user/product/id")
    public Optional<userProduct> getUserProductByID(@RequestParam Integer id){
        return userProductRepository.findById(id);
    }

   /* @PostMapping("/load")
    public List<User2>persist(@RequestBody final User2 user2){
        userRepo.save(user2);
        return userRepo.findAll();
    }*/
}
