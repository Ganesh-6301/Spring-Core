package assignmen3.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	ApplicationContext context12= new ClassPathXmlApplicationContext("Navin.xml");
		
		 Customer ad=(Customer) context12.getBean("customer");
		
	     System.out.println(ad);

	}

}
