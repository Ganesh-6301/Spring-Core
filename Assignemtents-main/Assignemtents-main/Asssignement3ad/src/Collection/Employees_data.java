package Collection;

import java.util.HashMap;

public class Employees_data {
	int navin;
	

	


	public Employees_data(int navin) {
		this.navin = navin;
	}
	
	
	 public String toString()
	 {
		 
		 return  navin+"";
	 }

	@Override
	public int hashCode() {

		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	
}


class hasmapchek

{
	public static void main(String[] args) {
		
		Employees_data a1= new Employees_data(24);
		Employees_data a2= new Employees_data(34);
		
		HashMap<Employees_data,String> h1= new HashMap<Employees_data, String>();
		
		
		h1.put(a1, "Navin");
		h1.put(a2, "Asha");
		
		System.out.println(h1);
		
		System.out.println(h1.get(a2));
		
		
	}


	
	//so when we override equal method which always give true and hascode fixed value
	//then due to return true the hasmap consider its the same key so its replace one value with another
     // if return false then its shows all the output


}
