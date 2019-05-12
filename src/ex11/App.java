package ex11;

public class App {
	public static void main(String[] args) {
		Book book = new Book("Cthulhu", "Lovecraft", "Reborn the fallen God");
		Print printToConsole = new PrintTextToConsole();
		
		System.out.println("Book title: " + book.getName());
		System.out.println("Author Name: " + book.getAuthor());
		System.out.println("-------------------------");
		printToConsole.print(book.getText());
		System.out.println("-------------------------");
		System.out.println("");
		
		ValidateString validateString = new IsAWordInText();
		System.out.println("Testing Interfaces:");
		System.out.println("Is 'God' in the text?");
		System.out.println(validateString.isValid(book.getText(), "God"));
		System.out.println("");
		
		EditString editWord = new EditAWord();
		System.out.println("Changing 'God' to 'Lord'");
		System.out.println(editWord.edit(book.getText(), "God", "Lord"));

	}
}
