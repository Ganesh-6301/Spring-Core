package anno;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@PropertySource("classpath:app.properties")
@SpringBootConfiguration
public class mainread {

	public static void main(String[] args) {
		
		

		ClassPathXmlApplicationContext context12=new ClassPathXmlApplicationContext("navin2.xml");
		
		
		Service s= (Service)context12.getBean("service");
		
		s.Someservie();
		
	
		

	}

}
