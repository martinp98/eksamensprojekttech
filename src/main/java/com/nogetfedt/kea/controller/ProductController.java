package com.nogetfedt.kea.controller;

import com.nogetfedt.kea.repository.NameSorter;
import com.nogetfedt.kea.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    @ModelAttribute
    @GetMapping("/view")
    public String viewProduct(Model model)
    {
        model.addAttribute("products", repo.findAll());

        return "/view";
    }

    /*@PostMapping("/viewSearch")
    public String viewSearchProduct(WebRequest request, Model model)
    {
        List viewList = repo.findAll();

        int id = Integer.parseInt(request.getParameter("searchId"));

        if(id == 1)
        {
            model.addAttribute("products", viewList.sort(NameSorter);)
        }

    }*/



    //Read
            //ReadAll

            //ReadById

        //Update

        //Delete


}
