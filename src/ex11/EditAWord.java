package ex11;

public class EditAWord implements EditString {

	public String edit(String text, String oldWord, String newWord) {
		return text.replaceAll(oldWord, newWord);
	}
	
}
