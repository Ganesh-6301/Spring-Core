package CollectionFrame;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashANDLinkedHash {

	public static void main(String[] args) {
		
       
		HashSet<String> h=new HashSet<String>();
		h.add("G");
		h.add("S");
		h.add("3");
		h.add("B");
		
		System.out.println("hash set output which is unorderd "+h);
		
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		l.add("G");
		l.add("S");
		l.add("3");
		l.add("B");
		
		System.out.println("hash set output which is orderd "+l);
		
		
		
	}

}
