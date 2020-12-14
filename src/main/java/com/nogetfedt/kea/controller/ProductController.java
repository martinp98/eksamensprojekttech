package com.nogetfedt.kea.controller;

import com.nogetfedt.kea.model.IntComparer;
import com.nogetfedt.kea.model.Product;
import com.nogetfedt.kea.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
            @RequestMapping("/deleteProduct")
            public String deleteProduct(Model model){return "deleteProduct";}

            @PostMapping("/deleteProduct")
            public String deleteProductPost(@ModelAttribute IntComparer intComparer){
            if (intComparer.compare()){
            repo.deleteById(intComparer.getInt1());}
            else{return "deleteProductFailed";}
             return "deleteProduct";}
            //modtag 2 ints fra model
            //hvis de matcher, så prøv at slette produktet med den ID


}
