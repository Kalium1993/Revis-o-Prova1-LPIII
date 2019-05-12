package ex14;

import java.util.List;

public class Project {

	private List<Developer> developers;
	
	public Project(List<Developer> developers) {
		this.developers = developers;
	}

	public void implement() {
		for (Developer developer : developers) {
			developer.developing();
		}
	}

}
