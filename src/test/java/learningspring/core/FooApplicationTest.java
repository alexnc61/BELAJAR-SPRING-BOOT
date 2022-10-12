package learningspring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import learningspring.core.application.FooApplication;
import learningspring.core.data.Foo;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {
	
	@Autowired
	Foo foo;
	
	@Test
	void testSpringBoot() {
		Assertions.assertNotNull(foo);
	}
	
	
}
