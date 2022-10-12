package learningspring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learningspring.core.data.Bar;

@Configuration
public class BarConfiguration {

	
	@Bean
	public Bar bar() {
		return new Bar();
	}
}
