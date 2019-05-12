package ex04Array;

public class App {
	public static void main(String[] args) {
		String[] names = {"McNealy, Scott", "James Gosling", "Naughton, Patrick"};
		NameFactory factory = new NameFactory();
		FullName name;
		
		for (int i = 0; i < names.length; i++) {
			name = factory.getFullName(names[i]);
			name.getName(names[i]);
			System.out.println("");
		}
		
	}
}
