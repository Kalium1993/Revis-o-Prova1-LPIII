package ex03FactoryMethod;

import java.io.IOException;
import java.util.Random;

public class App {
	public static void main(String[] args) throws IOException {
		PrinterFactory factory = new PrinterFactory();
		String[] random = { "File", "Print" };
		Random r = new Random();
		int randomPos = r.nextInt(random.length);
		Printer print;

		print = factory.getPrinter(random[randomPos]);
		print.print();

	}
}
