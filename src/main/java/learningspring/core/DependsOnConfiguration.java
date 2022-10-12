package learningspring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import learningspring.core.data.Bar;
import learningspring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependsOnConfiguration {
	
	@Lazy
	@Bean
	@DependsOn({
		"bar"
	})
	public Foo foo() {
		log.info("Create new foo");
		return new Foo();
	}
	
	@Bean
	public Bar bar() {
		log.info("Create new bar");
		return new Bar();
	}
	
}
