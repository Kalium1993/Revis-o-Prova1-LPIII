package ex03FactoryMethod;

public class PrinterFactory {

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
