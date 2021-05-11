package LambdaBasics;
import java.util.Scanner;


public class Arithmatic {
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
	
	Arithmatic1 ArthimataicOperations1=(c,d)-> c+d;
	
	
	System.out.println("for addition="+ArthimataicOperations1.Girish(a,b));
	
	Arithmatic1 ArthimataicOperations=(c,d)-> c/d;
	
	System.out.println("for division="+ArthimataicOperations.Girish(a,b));
	
	Arithmatic1 ArthimataicOperations3=(c,d)-> c*d;
	System.out.println("for multiplication="+ArthimataicOperations3.Girish(a,b));
	Arithmatic1 ArthimataicOperations4=(c,d)-> c-d;
	System.out.println("for subsraction="+ArthimataicOperations4.Girish(a,b));
	
	
	
}

}
interface Arithmatic1
{
	float Girish(int a,int b);



}