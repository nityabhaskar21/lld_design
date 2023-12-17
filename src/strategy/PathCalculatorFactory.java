package strategy;
 
public class PathCalculatorFactory {
	public static PathCalculatorStrategy getPathCalculator(String mode) {
		switch (mode) {
		case "Car":
			return CarPathCalculatorStrategy.getInstance();
		case "Bike":
			return BikePathCalculatorStrategy.getInstance();
		case "Walk":
			return WalkPathCalculatorStrategy.getInstance();
		default:
			return null;
		}
	}

}
