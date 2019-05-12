package ex04List;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("McNealy, Scott");
		names.add("James Gosling");
		names.add("Naughton, Patrick");
		
		NameFactory factory = new NameFactory();
		FullName fullName;
		
		for (String name : names) {
			fullName = factory.getFullName(name);
			fullName.getName(name);
			System.out.println("");
		}
	}
}
