package appdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {
	
	public static void main(String[] args) {
		
		

		ApplicationContext context12= new ClassPathXmlApplicationContext("navin3.xml");
		
		Applicationclass n=(Applicationclass)context12.getBean("applicationclass");
		
		n.navin();
		
		navin a=(navin)context12.getBean("navin1");
		a.navin3();
		
	}
	
}
