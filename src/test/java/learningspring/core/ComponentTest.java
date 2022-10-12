package learningspring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learningspring.core.repository.ProductRepository;
import learningspring.core.service.ProductService;

public class ComponentTest {
	
	private ConfigurableApplicationContext applicationContext;
	
	@BeforeEach
	void setUp() {
		applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
	}
	
	@Test
	void testService() {
		ProductService productService1 = applicationContext.getBean(ProductService.class);
		ProductService productService2 = applicationContext.getBean("productService",ProductService.class);
		
		Assertions.assertSame(productService1, productService2);
	}
	@Test
	void testContstructorDependencyInjection() {
		ProductService productService= applicationContext.getBean(ProductService.class);
		ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
		
		Assertions.assertSame(productService, productRepository);
	}
}
