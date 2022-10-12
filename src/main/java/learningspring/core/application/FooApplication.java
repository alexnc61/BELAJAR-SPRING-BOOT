package learningspring.core.application;

import java.util.List;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import learningspring.core.data.Foo;
import learningspring.core.listener.AppStartingListener;

@SpringBootApplication
public class FooApplication {
	
	@Bean
	public Foo foo() {
		return new Foo();
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication application = new SpringApplication(FooApplication.class);
		application.setBannerMode(Mode.OFF);
		application.setListeners(List.of(new AppStartingListener()));
		
		
		ConfigurableApplicationContext applicationContext = application.run(args);
		
		Foo foo = applicationContext.getBean(Foo.class);
		System.out.println(foo);
	}

	
	
	
//	public static void main(String[] args) {
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//		Foo foo = applicationContext.getBean(Foo.class);
//		System.out.println(foo);
//	}
	
}
