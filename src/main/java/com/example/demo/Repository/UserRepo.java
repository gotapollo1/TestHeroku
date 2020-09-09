package com.example.demo.Repository;

import com.example.demo.Model.Product;
import com.example.demo.Model.User2;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<User2,Integer> {

    User2 findByName(String name);


}
