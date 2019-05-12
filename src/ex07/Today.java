package ex07;

public class Today {
	private Week currentDay;
	
	public void todayIs(Week currentDay) {
		this.currentDay = currentDay;
	}
	
	public void messageOfTheDay() {
		this.currentDay.day();
		System.out.println("");
	}
}
