package encapsulation;

public class Encap1 {

	public static void main(String[] args) {
		
     laptop p1=new laptop();
     
     p1.setPrice(44);
     
     System.out.println(p1.getPrice());
     
		
	
     
	}
}
	class laptop
	{   
		private int price;
		
		public void setPrice(int price)
		{
			boolean Ganesh=true;
			
			if(!Ganesh)
			{
				
				System.out.println("u cannot set the price");
			}
			
			else
			{

			this.price=price;
			
			}
		}

		public int getPrice() {
			
			return price;
		}
		

	}


