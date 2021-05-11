package CollectionFrame;
import java.util.Comparator;
import java.util.TreeMap;

 class Personsecnd {
    String owerName;
    String carModel ;
    int carNo;
    String owerMobileNo;
    String owerAddress;
	 
    
	
    /*public  Personsecnd (String owerName,String carModel,int carNo,String owerMobileNo,String owerAddress)
	{
		
		this.owerName=owerName;
		this.carModel=carModel;
		this.carNo=carNo;
		this.owerMobileNo=owerMobileNo;
		this.owerAddress=owerAddress;
		
		
	}*/
	
    
    
    
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
	
	
	
	
	}
	
	
	 class Ownerdetails extends Personsecnd {

public static  void main(String[] args) {
	
	Personsecnd p1=new Personsecnd();		
	
 }
 
 
 
 
 
 public  void addmethod()
 {		
		TreeMap<Integer, Personsecnd> t=new TreeMap<Integer, Personsecnd>(new MyComparator());
		
		t.put(100,p1);
		t.put(101,p2);
		t.put(103,p3);
	
		System.out.println(t);	
		

		
		System.out.println(t);
 } 


 }





class MyComparator implements Comparator<Object>{

	
	public int compare(Object o1, Object o2) {
		
		//Personsecnd e1=(Personsecnd)o1;
		//Personsecnd e2=(Personsecnd)o2;
		//int s1=e1.month;
		//int  s2=e2.month;
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s1.compareTo(s2);
		
	}
}
