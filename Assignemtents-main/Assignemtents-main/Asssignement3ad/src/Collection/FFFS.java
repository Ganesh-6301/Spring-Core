package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FFFS {

	
	public static void main(String[] args) {
		
	
	/*ArrayList i=new ArrayList();
	
	i.add("Raju");
	i.add(6);
	i.add("Farhan");
	i.add("Rancho");
	
   Iterator i1=i.iterator();
   while(i1.hasNext())
   {
	   
	   Object a=i1.next();
	  i.add("om");
	   System.out.println(a);
	   
	   
	   
   }*/
		
		HashSet h=new HashSet();
		
		h.add("Raju");
		h.add("Farhan");
		h.add(2);

		Iterator i1=h.iterator();
		 while(i1.hasNext())
		   {
			   
			   Object a=i1.next();
			  h.add("Rancho");
			   System.out.println(a);
			   
			   
			   
		   }
	
}
	}
