package appdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class navin implements ApplicationContextAware{
	
	private ApplicationContext context;
	
	

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		context = applicationContext;
	}
	
	
	
	public  void navin3()
	{
		
		Appli2 a=(Appli2) context.getBean("appli2");
		
	   a.navin2();
		
		
	}
	
}

