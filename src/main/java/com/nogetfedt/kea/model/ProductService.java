package com.nogetfedt.kea.model;

import com.nogetfedt.kea.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

        private ProductRepo productRepo;

        @Autowired
        public ProductService(ProductRepo productRepo){
            this.productRepo = productRepo;
        }

        public Optional<Product> get(int id) {
            return productRepo.findById(id);
        }

}
