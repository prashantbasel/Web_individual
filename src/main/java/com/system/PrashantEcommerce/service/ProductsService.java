package com.system.PrashantEcommerce.service;

import com.system.PrashantEcommerce.entity.Products;
import com.system.PrashantEcommerce.pojo.ProductsPojo;

import java.io.IOException;
import java.util.List;

public interface ProductsService {

    String save(ProductsPojo productsPojo) throws IOException;

    List<Products> fetchAll();

    Products fetchById(Integer id);

    void deleteById(Integer id);

}
