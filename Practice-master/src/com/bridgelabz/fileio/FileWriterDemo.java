package com.bridgelabz.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {

		File file = new File("append.txt");
		FileWriter fr = new FileWriter(file, true);
		fr.write("     succefully write");
		fr.close();

	}
}
