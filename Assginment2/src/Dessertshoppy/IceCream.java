package Dessertshoppy;

import java.util.Scanner;

public class IceCream extends dessarts{
	int IceCost=40;
	int IceCount=1;


	
	void getCost() {
		Scanner Ice=new Scanner(System.in);
		System.out.println("Enter the number of Ice Cream");
		IceCount=Ice.nextInt();
		
		System.out.println("\nThe total prize of one IceCream is "+IceCost+" rupeee "+" total candies are " +IceCount);
		
		
	}

}
