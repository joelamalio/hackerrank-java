package br.com.joelamalio.hackerrank.java.strings.patternsyntaxchecker;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {
	
	@Test
	public void testCase0() {
		input("3");
		input("([A-Z])(.+)");
		input("[AZ[a-z](a-z)");
		input("batcatpat(nat");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("Valid");
		output("Invalid");
		output("Invalid");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
}
