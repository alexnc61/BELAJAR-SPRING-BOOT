package learningspring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learningspring.core.data.Bar;
import learningspring.core.data.Foo;

public class ScanTest {
	
	private ConfigurableApplicationContext applicationContext;
	
	@BeforeEach
	void setUp() {
		applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
	}
	
	@Test
	void testScan() {
		Foo foo = applicationContext.getBean(Foo.class);
		Bar bar = applicationContext.getBean(Bar.class);
	}
	
}
