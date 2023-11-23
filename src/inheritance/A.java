package inheritance;

public class A {
	String name;
	A() {
		System.out.println("Inside A");
	}
	
	A(String name) {
		this.name=name;
		System.out.println("Inside A param");
	}
}
