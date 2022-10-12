package learningspring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learningspring.core.data.Foo;


@Configuration
public class FooConfiguration {
	@Bean
	public Foo foo() {
		return new Foo();
	}
}
