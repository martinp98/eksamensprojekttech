package com.nogetfedt.kea.repository;

import com.nogetfedt.kea.model.Product;

import java.util.Comparator;

public class NameSorter implements Comparator<Product>
{
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getProduct_Name().compareToIgnoreCase(o1.getProduct_Name());
    }
}