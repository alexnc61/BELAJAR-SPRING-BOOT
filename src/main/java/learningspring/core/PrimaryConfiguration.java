package learningspring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import learningspring.core.data.Foo;

public class PrimaryConfiguration {
	
	@Primary
	@Bean
	public Foo foo1() {
		return new Foo();
	}
	
	@Bean
	public Foo foo2() {
		return new Foo();
	}

}
