package br.com.joelamalio.hackerrank.java.advanced.simpleadditionvarargs;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {
	
	@Test
	public void testCase0() {
		setInputFileByPath("advanced/simpleadditionvarargs/testCase0_input.txt");
		setOutputFileByPath("advanced/simpleadditionvarargs/testCase0_output.txt");
		Solution.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}

}
