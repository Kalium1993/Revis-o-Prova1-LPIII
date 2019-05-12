package ex11;

public class Book {
	private String name;
	private String author;
	private String text;

	public Book(String name, String author, String text) {
		this.name = name;
		this.author = author;
		this.text = text;
	}

	public Book() {

	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getText() {
		return text;
	}
}
