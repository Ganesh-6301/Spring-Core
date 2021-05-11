package Assignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class Navin23 {

	@Autowired
	Questions ques;
	
	@Test
	void test() {
		
		int actual=ques.getQuestionid();
		
		assertEquals(2, actual);
		
	}

}
