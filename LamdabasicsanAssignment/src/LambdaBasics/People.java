package LambdaBasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class People {
	
	String name;
	String lastname;
	int age;
	public People(String name, String lastname, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	 {
		 
		 return  name+","+lastname+","+age+",";
	 }

}




class exercise
{
	    public static void main(String[] args) {
	    	
	    	List<People> people=Arrays.asList(
	    			
	    		      new People("Rancho", "Chanchhad", 24),
	    		      new People("Raju","Rastogi", 23),
	    		      new People("Farhan","Kureshi", 23)
	    			);
	    	
	    
	    	//sort according to name
	    	Collections.sort(people, (p1,p2)->p1.getLastname().compareTo(p2.getLastname()));
	    	//printing all the names 
	    	
	    	System.out.println("\n print all");
	    	PrintConditional(people,p->true);
	    	
	    	//print the method last with c
	    	
	    	
	    	System.out.println("\n first name starts with v");
	    	
	    	PrintConditional(people,p->p.getName().startsWith("V"));
	    		
	    	
	    	
	    	System.out.println("\n first last starts with R");
	    	
	    	PrintConditional(people,p->p.getLastname().startsWith("R"));
	    		
	}

		private static void PrintConditional(List<People> people,Condition condition) {
			for(People p:people)
			{
				if( condition.test(p))
				{
				System.out.println(p);
				}
			}
			
		}

		



}

interface Condition
{
	boolean test(People p);

}
