package com.bridgelabz.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileReadWriteDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File  f =new File("index.txt");
		PrintWriter pw=new PrintWriter(f);
		
		pw.append(" ");
		pw.close();
	}
}
