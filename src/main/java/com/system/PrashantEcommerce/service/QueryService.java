package com.system.PrashantEcommerce.service;

import com.system.PrashantEcommerce.entity.Queries;
import com.system.PrashantEcommerce.pojo.QueriesPojo;

import java.util.List;

public interface QueryService {
    List<Queries> fetchAll();

    String save(QueriesPojo queriesPojo);
}
