package learningspring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import learningspring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfiguration {
	@Bean
	@Scope("prototype")
	public Foo foo() {
		log.info("Create new foo");
		return new Foo();
	}
	
}
