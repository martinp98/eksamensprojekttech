package com.nogetfedt.kea.controller;

import com.nogetfedt.kea.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    ProductRepo repo;

    //Show frontpage
    @RequestMapping("/")
    public String index()
    {
        return "index.html";
    }

    //Crud functions used from ProductRepo extends JpaRepository


        //Create
            //showing page
            @RequestMapping("/addProduct")
            public String addProduct()
            {
                return "addProduct";
            }


    //Read
            //ReadAll

            //ReadById

        //Update

        //Delete


}
