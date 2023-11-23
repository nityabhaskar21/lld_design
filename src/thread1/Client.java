package thread1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello printed by thread: "+Thread.currentThread().getName());
		
		HelloworldPrint obj = new HelloworldPrint();
		Thread thread=new Thread(obj);
		thread.start();
		
		Thread thread1=new Thread(obj);
		thread1.start();
	}
	
	//Print "Hello" in different thread
	//1. Identify task
	//2. Create a class for each task
	//3. Make this class implement Runnable interface
	//4. Implement run() method -> Write code in run() method
	//5. Create a thread obj from where you want to run
	//6. Run the task

}
