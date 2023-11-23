package thread1;

public class Number1to100Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=100; i++) {
			Number1to100 objNumber1to100 = new Number1to100(i);
			Thread thread = new Thread(objNumber1to100);
			thread.start();
		}

	}

}
