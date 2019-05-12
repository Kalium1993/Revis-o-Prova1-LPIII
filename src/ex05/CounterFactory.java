package ex05;

public class CounterFactory {
	
	public Counter getCounter(String type) {
		if (type.equals("File")) {
			return new File();
		}
		if (type.equals("Console")) {
			return new Console();
		}
		
		throw new IllegalArgumentException("Invalid Type");
	}
}
