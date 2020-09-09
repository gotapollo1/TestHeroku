package com.example.demo.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }
}
