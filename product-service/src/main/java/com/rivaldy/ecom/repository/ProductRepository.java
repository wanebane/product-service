package com.rivaldy.ecom.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rivaldy.ecom.entity.TblProduct;

@Repository
public interface ProductRepository extends JpaRepository<TblProduct, UUID>{

}
