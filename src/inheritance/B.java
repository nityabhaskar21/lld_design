package inheritance;

public class B extends A{
	String name;
	B() {
		System.out.println("Inside B");
	}
	
	B(String name) {
		super(name);
		this.name=name;
		System.out.println("Inside B param");
	}
}
