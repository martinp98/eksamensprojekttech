package com.nogetfedt.kea.repository;

import com.nogetfedt.kea.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends JpaRepository<Product, Integer>
{
//can add more complex codes here, which the crud doesnt provide


}
