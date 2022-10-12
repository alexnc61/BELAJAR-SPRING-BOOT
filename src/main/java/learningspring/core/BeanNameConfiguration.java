package learningspring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import learningspring.core.data.Foo;

public class BeanNameConfiguration {
	
	@Primary
	@Bean(name = "fooFirst")
	public Foo foo1() {
		return new Foo();
	}
	
	@Bean(name = "fooSecond")
	public Foo foo2() {
		return new Foo();
	}

}
