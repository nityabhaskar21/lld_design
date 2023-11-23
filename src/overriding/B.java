package overriding;

public class B extends A{
	String name;
	void fun1() {
		System.out.println("Inside fun1 in B");
	}
	void fun2() {
		System.out.println("Inside fun2 in B");
	}
}
