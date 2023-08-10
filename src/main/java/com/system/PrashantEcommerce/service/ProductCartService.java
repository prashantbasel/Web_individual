package com.system.PrashantEcommerce.service;

import com.system.PrashantEcommerce.entity.ProductCart;
import com.system.PrashantEcommerce.pojo.ProductCartPojo;

import java.util.List;

public interface ProductCartService {
    List<ProductCart> fetchAll();

    ProductCartPojo save(ProductCartPojo productCartPojo);

    ProductCart fetchOne(Integer id);

    void deleteFromCart(Integer id);

    String updateQuantity(ProductCart productCart);

    List<ProductCart> fetchAll(Integer id);
}
