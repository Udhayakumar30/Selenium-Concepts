package com.java.webinteractions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(
				"C:\\Users\\lenovo pc\\eclipse-workspace\\SeleniumPractice\\resource\\testfile.txt");
		Scanner sc = new Scanner(System.in);
		String str = "";
		while (!(str = sc.nextLine()).equalsIgnoreCase("$")) {
			fw.write(str);
			fw.write("\n");
		}
		fw.close();
		

	}

}
