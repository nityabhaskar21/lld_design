package strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {
	private static WalkPathCalculatorStrategy instance;

	private WalkPathCalculatorStrategy() {
	}

	public static WalkPathCalculatorStrategy getInstance() {
		if (instance == null) {
			synchronized (WalkPathCalculatorStrategy.class) {
				if (instance == null) {
					instance = new WalkPathCalculatorStrategy();
				}
			}
		}
		return instance;
	}

	@Override
	public void findPath(String source, String destination) {
		System.out.println(String.format("Path calculator via WALK from %s to %s", source, destination));

	}

}
