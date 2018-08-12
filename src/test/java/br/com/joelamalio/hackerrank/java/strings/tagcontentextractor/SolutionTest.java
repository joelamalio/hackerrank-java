package br.com.joelamalio.hackerrank.java.strings.tagcontentextractor;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		setInputFileByPath("strings/tagcontentextractor/testCase0_input.txt");		
		setOutputFileByPath("strings/tagcontentextractor/testCase0_output.txt");
		Solution.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
}
