package strategy;

public class Client {
	public static void main(String[] args) {
		Maps maps = new Maps();
		maps.findPath("Delhi", "Chennai", "Bike");
		maps.findPath("Mumbai", "Ranchi", "Car");
	}
}
