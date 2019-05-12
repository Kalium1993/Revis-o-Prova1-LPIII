package ex12;

public class MotorCar implements Car {

	private Engine engine;

	public MotorCar(Engine engine) {
		this.engine = engine;
	}

	public void turnOnEngine() {
		engine.on();
	}

	public void accelerate() {
		engine.powerOn(1000);
	}

}
