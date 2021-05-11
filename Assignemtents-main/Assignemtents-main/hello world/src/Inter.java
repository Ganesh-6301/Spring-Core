
public class Inter {

	public static void main(String[] args) {
		navin na=new navin();
		venky ve=new venky();
		ve.read();
		na.read();
		

	}

}


class navin implements bob{

	@Override
	public void read() {
		System.out.println("navin is reading");
	}
	
}

class venky implements bob{

	@Override
	public void read() {
		System.out.println("venky is reading");
	}
	
	
}

interface bob{ //interface gives true abstraction than that of abstrcation
	
	void read();
}
