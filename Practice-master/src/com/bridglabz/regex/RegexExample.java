package com.bridglabz.regex;

import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		System.out.println("415111 ==>"+Pattern.matches("[1-9]{1}[1-9]{5}", "415111"));
		System.out.println("015111 ==>"+Pattern.matches("[1-9]{1}[1-9]{5}", "A15111"));
        System.out.println("\\n");

	}

}
