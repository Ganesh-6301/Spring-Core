package Collection;
import java.util.*;

public class Owner_details {
	String owerName;
	String carModel;
	int    carNo;
	String   owerMobileNo;
	String owerAddress;
	
	public Owner_details(String owerName, String carModel, int carNo, String owerMobileNo, String owerAddress) {
		
		this.owerName = owerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.owerMobileNo = owerMobileNo;
		this.owerAddress = owerAddress;
	}
	
	
	public String toString()
	 {
		 
		 return  owerName+"|"+carModel+"|"+carNo+"|"+owerMobileNo+"|"+owerAddress;
	 }


	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getOwerMobileNo() {
		return owerMobileNo;
	}

	public void setOwerMobileNo(String owerMobileNo) {
		this.owerMobileNo = owerMobileNo;
	}

	public String getOwerAddress() {
		return owerAddress;
	}

	public void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}


	public void remove() {
		// TODO Auto-generated method stub
		
	}
		

}

class Parked_Car_Owner_List
{  
	

	static Owner_details p1= new Owner_details("Gopal", "Ferrari", 6301, "9156254545", "6301 A1 group Pushpraj Chowk Sangli");
	static Owner_details p2= new Owner_details("Lucky", "Bugati", 9595, "9852652545", "9595 A4 group Pushpraj Chowk Sangli");
	static Owner_details p3= new Owner_details("Madhav", "Skoda", 0007, "9858658952", "0007 f6 group Pushpraj Chowk Sangli");
	static Owner_details p4= new Owner_details("Kareena", "Lambhorgini", 0107, "8369206828", "0107 b5 group Pushpraj Chowk Sangli");
     
	  

	
	  static TreeMap<Integer,Owner_details> h= new TreeMap<Integer,Owner_details>();
	  
	
	static int add_new_car(Owner_details obj)
	{
		
		
		h.put(100, p1);
		h.put(102, p2);
		h.put(103, p3);
		h.put(104, p4);
		
		
		

		
		
		System.out.println(h);
		return 0;
		
		
		
	}
	
	 public static  Object remove1(int n)
	 {
		 
		 h.remove(n);
		 
		 System.out.println(h);
		return h; 
		 
	   
	   
		   
	 }
	 
	 public static Object Get_owner_information(int token)
	 {
		 
		 
		 System.out.println(h.get(token));
		
		 return h.get(token);
		 
	 }
	 
	

	
	public static void main(String[] args) {
		
		add_new_car(p1);
		
		remove1(102);
		
		Get_owner_information(104);
		
		
	
		
	}



}





