package ex14;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Developer> developers= new ArrayList<>();
		developers.add(new JavaDeveloper());
		developers.add(new JavascriptDeveloper());
		developers.add(new JavaDeveloper());
		
		Project project = new Project(developers);
		project.implement();
	}
}
