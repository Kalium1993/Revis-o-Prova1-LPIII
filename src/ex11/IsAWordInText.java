package ex11;

public class IsAWordInText implements ValidateString {

	public boolean isValid(String text, String wordToValidate) {
		return text.contains(wordToValidate);
	}

}
