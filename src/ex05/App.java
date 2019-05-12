package ex05;

import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		CounterFactory factory = new CounterFactory();
		Counter counter;
		
		counter = factory.getCounter("Console");
		for (int i = 1; i <= 10; i++) {
			counter.count(i);
		}
		
		counter = factory.getCounter("File");
		for (int i = 1; i <= 10; i++) {
			counter.count(i);
		}
	}
}
