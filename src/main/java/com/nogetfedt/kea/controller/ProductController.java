package com.nogetfedt.kea.controller;

import com.nogetfedt.kea.model.IntComparer;
import com.nogetfedt.kea.model.Product;
import com.nogetfedt.kea.model.ProductService;
import com.nogetfedt.kea.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private ProductService productService;
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

            //Executing save
            @RequestMapping("/newProduct")
            public String newProduct(Product product)
            {
                repo.save(product);
                return "index";
            }

    //Read
            //ReadAll

            //ReadById

        //Update

            @RequestMapping("/update-product/{id}")
            public String updateProduct(@PathVariable int id, Model model){
            model.addAttribute("product", productService.get(id));
            return "/update-product";
            }


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
