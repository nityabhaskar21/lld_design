package thread1;

public class Number1to100 implements Runnable{
	private int numToPrint;
	Number1to100(int numToPrint) {
		this.numToPrint=numToPrint;
	}
	@Override
	public void run() {
		System.out.println(numToPrint+" from thread: "+Thread.currentThread().getName());
		
	}
	
}
