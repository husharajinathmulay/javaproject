package com.bridglabz.regex;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class RegexExampleTest {

	@Test
	public void test() {
		assertTrue(Pattern.matches("[a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.](com|in|org)","milind@gmail.org.com"));
	
	}

}
