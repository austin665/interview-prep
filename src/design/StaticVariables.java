package design;

public class StaticVariables {
	static int i;
	
	public static void main(String[] args) {
		StaticVariables obj = new StaticVariables();
		
		System.out.println("Before: "+i);
		
		obj.inc();
		
		System.out.println("After: "+obj.i);
	
		obj.inc1();
		
		System.out.println("After second: "+obj.i);
	}
	
	
	public void inc() {
		i++;
	}
	
	public void inc1() {
		i++;
	}

}
