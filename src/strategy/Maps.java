package strategy;

public class Maps {
	public void findPath(String source, String destination, String mode) {
		PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculator(mode);
		pathCalculatorStrategy.findPath(source, destination);
	}
}
