package Dessertshoppy;

import java.util.Scanner;

public class Candy1 extends dessarts {
	
	int CandyCost=5;
	int CandyCount=1;

	
	void getCost() {
		Scanner can=new Scanner(System.in);
		System.out.println("Enter the number of Candies");
		CandyCount=can.nextInt();
		CandyCost=(CandyCost*60);
		System.out.println("\nThe total prize of one Candy is "+CandyCost+" rupeee "+" total candies are " +CandyCount);
		
		}


	
	
	

}
