package Assignment2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Questionmain {

	public static void main(String[] args) {
		
		
		
		
		ApplicationContext context3= new ClassPathXmlApplicationContext("applicationContext.xml");
		
             
		Questions q=(Questions) context3.getBean("questions");
		
		
		
		System.out.println(q);
	}

}
