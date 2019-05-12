package ex03AbstractFactory;

public class PrinterFactory extends AbstractFactory {

	public Printer getPrinter(String type) {
		if (type.equals("File")) {
			return new File();
		}
		if (type.equals("Print")) {
			return new Print();
		}

		throw new IllegalArgumentException("Invalid Type");
	}
}
