package learningspring.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.jdi.connect.spi.Connection;

import learningspring.core.data.Server;

public class LifeCycleTest {
	private ConfigurableApplicationContext applicationContext;
	
	@BeforeEach
	void setUp() {
		applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
		applicationContext.registerShutdownHook();//cara otomatis
	}
	
	@AfterEach
	void tearDown() {
		//manual
//		applicationContext.close();
	}
	
	@Test
	void testConnection() {
		Connection connection = applicationContext.getBean(Connection.class);
	}
	@Test
	void testServer() {
		Server server = applicationContext.getBean(Server.class);
	}
}
