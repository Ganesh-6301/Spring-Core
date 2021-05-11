package Springbasics;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Draw {
	

	public void draw() {
		System.out.println("The triangle is drwiaing");
		
	}

}
