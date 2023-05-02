package com.bridgelabz.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsException 
{
  public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw = new PrintWriter("file.txt");
}
}
