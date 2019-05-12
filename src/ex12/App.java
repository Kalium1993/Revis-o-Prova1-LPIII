package ex12;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		
		cars.add(new MotorCar(new Engine()));
		cars.add(new ElectricCar());
		cars.add(new MotorCar(new Engine()));
		
		for (Car car : cars) {
			car.turnOnEngine();
		}
	}
}
