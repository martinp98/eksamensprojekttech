package com.nogetfedt.kea.repository;

import com.nogetfedt.kea.model.Product;

import java.util.Comparator;

public class PriceSorter implements Comparator<Product>
{
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice().compareTo(o1.getPrice());
    }
}
