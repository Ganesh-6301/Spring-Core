package CollectionFrame;
import java.util.*;
public class userDetail {

	String name;
	int id;
	
	userDetail(String name,int id)
	{
		this.name=name;
		this.id=id;
		
		
	}
	
	public String toString()
	{
		
		return name+"..."+id;
	}
	

}

class demo{
	public static void main(String[] args) {
		
		userDetail u1=new userDetail("Hitesh", 123);
		userDetail u2=new userDetail("Sumit",245);
		userDetail u3=new userDetail("Sushil",89);
		
		
		TreeSet t=new TreeSet();
		t.add(u1);
		t.add(u2);
		t.add(u3);
		
		
		System.out.println(t);
	}
	
	
	
}
