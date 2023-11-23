package overriding;

public class Client {

	public static void main(String[] args) {
		A obj=new B();
		obj.fun1();
		System.out.println("Finished");

	}

}
