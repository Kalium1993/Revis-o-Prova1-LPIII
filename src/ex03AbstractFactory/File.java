package ex03AbstractFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File implements Printer{

	public void print() throws IOException {
		String msg = "Hello World \n";
		
		
		Path path = Paths.get("output.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		Files.write(path, msg.getBytes(), StandardOpenOption.APPEND);
	}

}
