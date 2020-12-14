package com.nogetfedt.kea.controller;

import com.nogetfedt.kea.model.IntComparer;
import com.nogetfedt.kea.model.Product;
import com.nogetfedt.kea.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
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
        @GetMapping("/edit/{id}")
        public String showUpdateForm(@PathVariable("id") int id, Model model) {
            Product product = ProductRepo.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));

            model.addAttribute("product", product);
            return "update-product";
        }

        @PostMapping("/update/{id}")
        public String updateProduct(@PathVariable("id") int id, @Valid Product product,
                                    BindingResult result, Model model) {
            if (result.hasErrors()) {
                product.setProduct_Id(id);
                return "update-product";
            }

            ProductRepo.save(product);
            model.addAttribute("product", ProductRepo.findAll());
            return "redirect:/index";
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
