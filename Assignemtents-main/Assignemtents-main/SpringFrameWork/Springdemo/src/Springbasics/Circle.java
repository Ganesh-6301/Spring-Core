package Springbasics;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Draw{

	public void draw() {
		System.out.println("The Circle is drwiaing");
		
	}

}
