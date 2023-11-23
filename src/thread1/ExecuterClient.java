package thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ExecutorService  executor = Executors.newFixedThreadPool(10);
		ExecutorService  executor = Executors.newCachedThreadPool();

		for (int i=1; i<=100; i++) {
			Number1to100 objNumber1to100 = new Number1to100(i);
			executor.execute(objNumber1to100);
		}
		
		executor.shutdown();
	}

}
