package Dessertshoppy;

import java.util.Scanner;

public class Cookie extends dessarts{
	int CookieCost=4;
	int CookieCount=1;


	
	void getCost() {
		
		
		Scanner can=new Scanner(System.in);
		System.out.println("Enter the number of Cookie");
		CookieCount=can.nextInt();
	
		CookieCost=(CookieCost*70);
		System.out.println("\nThe total prize of one Cookie is "+CookieCost+" rupee "+" total cookie are " +CookieCount);
		
		
		
	}

}
