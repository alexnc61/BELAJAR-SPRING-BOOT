package learningspring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import learningspring.core.repository.ProductRepository;
import lombok.Getter;

@Component
public class ProductService {
	
	@Getter
	private ProductRepository productRepository;
	
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public ProductService(ProductRepository productRepository,String name) {
		this.productRepository = productRepository;
	}
	
}
