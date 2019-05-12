package ex04List;

public class NameFactory {
	public FullName getFullName(String names) {
		if (names.contains(",")) {
			return new SurnameName();
		}
		return new NameSurname();
	}
}
