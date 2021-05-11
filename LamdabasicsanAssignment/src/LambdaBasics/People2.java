package LambdaBasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class People2 {
	
	String name;
	String lastname;
	int age;
	public People2(String name, String lastname, int age) {
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




class navin{
	
	 public static void main(String[] args) {
	    	
	    	List<People> people=Arrays.asList(
	    			
	    		      new People("Rancho", "Chanchhad", 24),
	    		      new People("Raju","Rastogi", 23),
	    		      new People("Farhan","Kureshi", 23)
	    			);
	    	
	    	
	    	
	    //the predicate is functional interface that can be anywhere you need to evaluate a boolean condition
	    	Predicate<String> one= t -> t.length()<6; 
	    			/*{

						@Override
						public boolean test(String t) {
							return t.equals("Rancho");
							
						}
	    		
	    		
	    			};*/
	    	
	    	String s="Rancho";
	            System.out.println(one.test(s));
	    	
	    	
	    	
	   //consumer that accepts single input argument and return no result
	    	/*Consumer<String> n= t->System.out.println(t.equals("Rancho"));
	    	Consumer<String> n=new Consumer<String>()
	    			{

						@Override
						public void accept(String t) {
							
						   System.out.println(t.equals("Rancho"));
						}

						
	    			};
	                       n.accept("Rancho");*/
	    //Functions its take argument give input eg.it's convert or transform from one object to another
	    	
	    	/*Function<Integer,Integer> nv=t->t.compareTo(54);
	    	
	    	
	    	System.out.println(nv.apply(3));*/
	    	
	    	
	   //supplier it not take any argument but return some value when being  called more than once
	    	/*Supplier<Integer> nvi=()->98;
	    	
	    			    		System.out.println(nvi.get());*/ 
	 
	 
	 
	 
	 
	
	 }
}
