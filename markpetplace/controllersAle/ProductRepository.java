package org.markpetplace.markpetplace.repository;


import org.markpetplace.markpetplace.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
