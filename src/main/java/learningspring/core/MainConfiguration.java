package learningspring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import learningspring.core.configuration.BarConfiguration;
import learningspring.core.configuration.FooConfiguration;

@Configuration
@Import({
	FooConfiguration.class,
	BarConfiguration.class
})
public class MainConfiguration {
	
	
	
}
