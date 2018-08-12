package br.com.joelamalio.hackerrank.java.strings.javaregex;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		setInputFileByPath("strings/javaregex/testCase0_input.txt");		
		setOutputFileByPath("strings/javaregex/testCase0_output.txt");
		Solution.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
}
