
public class bubblesort_1 {

	public static void main(String[] args) {
	
		int Ganesh[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		int temp=0;
		
		for(int i=0;i<Ganesh.length-1;i++)
		{
		
		    for(int j=0;j<Ganesh.length-1;j++)
		    {
		    	if(navin1[j]>Ganesh[j+1])
		    	{
		       temp=Ganesh[j];
		       Ganesh[j]=Ganesh[j+1];
		       Ganesh[j+1]=temp;
		    	}
		    }
		    
		}
		
		for(int i=0;i<Ganesh.length-1;i++)
		{
			
			System.out.println(Ganesh[i]);
		}
		
		

	}

}
