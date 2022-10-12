package learningspring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"learningspring.core.configuration"
})
public class ScanConfiguration {

}
