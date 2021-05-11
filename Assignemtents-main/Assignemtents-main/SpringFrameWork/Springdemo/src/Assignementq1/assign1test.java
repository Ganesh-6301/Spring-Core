package Assignementq1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class assign1test {
	
	ArrayList a=new ArrayList();
	ArrayList b=new ArrayList();

	@Test
	void test() {
	
		Addresses ada=new Addresses("yallama mandir","solapur","maharshtra", "413005", "india");
		Customer cu=new Customer(1,"Navin","9579118286",ada);
		
		a.add("Ganesh");
		a.add("8369206828");
		a.add("Vishrambag");
		a.add("Sangli");
		a.add("maharashtra");
		a.add("416416");
		a.add("India");
	
		
		
	Object Ganesh=cu;
	
	b=(ArrayList)Ganesh;
	
	    assertEquals(b, a);
	}

}
