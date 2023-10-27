package org.markpetplace.markpetplace.service;

import java.util.List;
import java.util.Optional;

import org.markpetplace.markpetplace.model.Product;
import org.markpetplace.markpetplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	//CRUD
	//GET ALL
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	//GET by ID
	public Optional<Product> getProduct(Long id) {
		return productRepository.findById(id);
	}
	
	//DELETE
	public void deleteProduct(Long id) {
		if (productRepository.existsById(id)) {
			productRepository.deleteById(id);
		}else {
			throw new IllegalStateException("The product with the id doesn't exist.");
		}
	}
	
	//POST 
	/*public void addProduct(Product product) {
		Optional<Product> productByCode = productRepository.findByCode(product.getCode());
		if (productByCode.isPresent()) {
			throw new IllegalStateException("Sorry, the product is already registered.");
		}
		productRepository.save(product);
	}*/
	
	//PUT by id
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

}
