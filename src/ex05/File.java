package ex05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File implements Counter {

	public void count(Integer i) throws IOException {
		String msg = i.toString() + "\n";
		
		Path path = Paths.get("log.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		Files.write(path, msg.getBytes(), StandardOpenOption.APPEND);
	}
}
