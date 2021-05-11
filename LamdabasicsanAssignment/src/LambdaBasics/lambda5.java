package LambdaBasics;

import java.util.ArrayList;

public class lambda5 {

	public static void main(String[] args) {
		ArrayList<String>navin=new ArrayList<String>();
		
		navin.add("Girish");
		navin.add("Rahul");
		navin.add("Neha");
		navin.add("Shradhha");
		navin.add("Varun");
		navin.add("Priya");
		StringBuilder pav=new StringBuilder();
		
		
		navin.stream()
		.map(s->s.substring(0,1))
		.forEach(s->pav.append(s));

		
		System.out.println(pav);
		
	}

}
