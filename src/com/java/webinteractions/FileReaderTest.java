package com.java.webinteractions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(
				"C:\\Users\\lenovo pc\\eclipse-workspace\\SeleniumPractice\\resource\\testfile.txt");

		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}
		fr.close();
	}

}
