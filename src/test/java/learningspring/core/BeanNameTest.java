package learningspring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learningspring.core.data.Foo;
import lombok.var;

public class BeanNameTest {

	private ApplicationContext applicationContext;
	
	@BeforeEach
	void setUp() {
		applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
	}
	
	@Test
	void testBeanName() {
		Foo foo = applicationContext.getBean(Foo.class);
		Foo fooFirst = applicationContext.getBean(Foo.class);
		Foo fooSecond = applicationContext.getBean(Foo.class);
		
		Assertions.assertSame(fooFirst, foo);
		Assertions.assertNotSame(foo, fooSecond);
		
		
	}
}
