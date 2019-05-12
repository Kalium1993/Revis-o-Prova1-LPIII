package ex13;

public class Penguin implements Bird, SwimmerBird {

	String currentLocation;
	int numberOfFeathers;

	public Penguin(int initialFeatherCount) {
		this.numberOfFeathers = initialFeatherCount;
	}

	public void molt() {
		this.numberOfFeathers -= 1;
	}

	public void swim() {
		this.currentLocation = "in the water";
	}

}
