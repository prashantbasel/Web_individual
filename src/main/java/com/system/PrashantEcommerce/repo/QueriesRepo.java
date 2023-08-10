package com.system.PrashantEcommerce.repo;

import com.system.PrashantEcommerce.entity.Queries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueriesRepo extends JpaRepository<Queries, Integer> {

}
