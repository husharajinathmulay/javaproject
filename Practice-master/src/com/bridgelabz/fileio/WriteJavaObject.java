package com.bridgelabz.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteJavaObject {
	public static void main(String[] args) {

		String path="C:\\Users\\abc\\Documents\\New folder\\firstDump.csv";
		
		try {
//			FileOutputStream fos=new FileOutputStream(path);
//			Student s =new Student(1,"ABC","Mumbai");
//			ObjectOutputStream out = new ObjectOutputStream(fos);
//			
//			out.writeObject(s);
//			
			FileInputStream fis =new FileInputStream("C:\\Users\\abc\\Documents\\New folder\\firstDump.csv");
			ObjectInputStream ios =new ObjectInputStream(fis);
			Student s1=  (Student) ios.readObject();
			System.out.println("student -->"+s1);
			ios.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
