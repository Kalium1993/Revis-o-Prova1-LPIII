package ex03AbstractFactory;

public class FactoryProvider {
	public static AbstractFactory getFactory(String factoryName) {
		if (factoryName.equals("Printer")) {
			return new PrinterFactory();
		}
		
		throw new IllegalArgumentException("Invalid Type");
	}
}
