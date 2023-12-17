package strategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {
	private static BikePathCalculatorStrategy instance;
	
	private BikePathCalculatorStrategy() {}
	
	public static BikePathCalculatorStrategy getInstance() {
		if (instance==null) {
			synchronized (BikePathCalculatorStrategy.class) {
				if (instance==null) {
					instance = new BikePathCalculatorStrategy();
				}
			}
		}
		return instance;
	}
	

	@Override
	public void findPath(String source, String destination) {
		System.out.println(String.format("Path calculator via BIKE from %s to %s", source, destination));
	}

}
