package ex07;

public class App {
	public static void main(String[] args) {
		Today today = new Today();
		
		today.todayIs(new Monday());
		today.messageOfTheDay();
		
		today.todayIs(new Tuesday());
		today.messageOfTheDay();
		
		today.todayIs(new Wednesday());
		today.messageOfTheDay();
		
		today.todayIs(new Thursday());
		today.messageOfTheDay();
		
		today.todayIs(new Friday());
		today.messageOfTheDay();
		
		today.todayIs(new Saturday());
		today.messageOfTheDay();
		
		today.todayIs(new Sunday());
		today.messageOfTheDay();
	}
}
