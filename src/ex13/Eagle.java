package ex13;

public class Eagle implements Bird, FlyerBird {
	String currentLocation;
	int numberOfFeathers;

	public Eagle(int initialFeatherCount) {
		this.numberOfFeathers = initialFeatherCount;
	}

	public void fly() {
		this.currentLocation = "in the air";
	}

	public void molt() {
		this.numberOfFeathers -= 1;
	}

}
