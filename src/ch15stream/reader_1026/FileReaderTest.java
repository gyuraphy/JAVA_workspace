package ch15stream.reader_1026;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("input.txt")){
			int i;
			while( (i = fr.read()) != -1){
				System.out.print((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
