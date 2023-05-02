package com.bridgelabz.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BuffereWriterDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("index.txt", true));
			br.write(sc.next());
			br.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
