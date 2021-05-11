package CollectionFrame;


import java.util.Comparator;
import java.util.TreeSet;

public class SavingsAccount {

	int accBalance;
	int   accID;
	String accHolderName;
	String isSalary;
	

	public SavingsAccount(int accBalance, int accID, String accHolderName, String isSalary) {
		super();
		this.accBalance = accBalance;
		this.accID = accID;
		this.accHolderName = accHolderName;
		this.isSalary = isSalary;
	}
	
	public String toString()
	 {
		 
		 return  accID+"|"+accBalance+"|"+accHolderName+"|"+isSalary+"|";
	 }
	
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getIsSalary() {
		return isSalary;
	}
	public void setIsSalary(String isSalary) {
		this.isSalary = isSalary;
	}
	
	
	void WithDraw()
	{
		
		
		
	}
	
	void Deposit()
	{
		
		
		
		
	}

}


class BankaccList{
	
	public static void main(String[] args) {
		
		SavingsAccount s1=new SavingsAccount(2559,103,"Rahul", "Salary");

		SavingsAccount s2=new SavingsAccount(7859,101,"Sourabh", "Salary");

		SavingsAccount s3=new SavingsAccount(5559,101,"Sumit", "Salary");

		SavingsAccount s4=new SavingsAccount(3659,104,"Yash", "Salary");
		
		
		TreeSet<SavingsAccount> t=new TreeSet<SavingsAccount>(new MyComparator());
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		
		System.out.println(t);
		
	}
	
}

class MyComparator implements Comparator

{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if (i1>i2)
		{
			
			return -1;
		}
		else if(i1<i2)
		{
			return 1;
			
		}
		else if(i1==i2)
		{
			
			
		}
		return i1;
	}
	
}





	
	
	
	
	
