package Springbasics;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Sprinng1st {

	public static void main(String[] args) {
	
      //Triangle triangle=new Triangle();
       
		ApplicationContext context1= new ClassPathXmlApplicationContext("Spring.xml");
		
		Draw d = (Draw) context1.getBean("circle");
		d.draw();
		
		Size s=(Size) context1.getBean("size1");
		s.display1();
		
        
		
		
    		  
		
		
	}

}
