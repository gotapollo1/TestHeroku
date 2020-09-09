package com.example.demo.Repository;

import com.example.demo.Model.userProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserProduct_Repository extends JpaRepository<userProduct,Integer> {

    Optional<userProduct> findById(Integer id);
}
