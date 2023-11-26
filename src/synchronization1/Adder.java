package synchronization1;

public class Adder implements Runnable{
	Count count;
	
	public Adder(Count count) {
		this.count=count;
	}

	@Override
	public void run() {
		for (int i=1; i<=1000; i++) {
			count.value+=1;
		}
	}

}
