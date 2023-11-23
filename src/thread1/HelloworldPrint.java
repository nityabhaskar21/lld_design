package thread1;

public class HelloworldPrint implements Runnable{

	@Override
	public void run() {
		System.out.println("hello world by thread: "+Thread.currentThread().getName());
		
	}

}
