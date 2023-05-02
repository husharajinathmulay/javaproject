package com.bridgelabz.java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		String line ="";
		Map<Integer,String>  map =new TreeMap<Integer,String>();
		
		
//		Path path = Paths.get("C:\\Users\\abc\\Documents\\New folder\\firstDump.csv");
//
//		if (Files.exists(path)) {
//			try {
//				Stream<String> stream = Files.lines(path);
//			
//			} catch (IOException e) {
//
//				e.printStackTrace();
//			}
//			System.out.println("file exist");
//		}
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\abc\\Documents\\New folder\\firstDump.csv"));
			
		while((line = reader.readLine()) != null)
		{
	     System.out.println(line);
		
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
