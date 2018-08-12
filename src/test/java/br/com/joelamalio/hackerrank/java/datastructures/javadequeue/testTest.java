package br.com.joelamalio.hackerrank.java.datastructures.javadequeue;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class testTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		setInputFileByPath("datastructures/javadequeue/testCase0_input.txt");		
		setOutputFileByPath("datastructures/javadequeue/testCase0_output.txt");
		test.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}

	@Test
	public void testCase1() {
		setInputFileByPath("datastructures/javadequeue/testCase1_input.txt");		
		setOutputFileByPath("datastructures/javadequeue/testCase1_output.txt");
		test.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}

	@Test
	public void testCase2() {
		setInputFileByPath("datastructures/javadequeue/testCase2_input.txt");		
		setOutputFileByPath("datastructures/javadequeue/testCase2_output.txt");
		test.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	@Test//(timeout = 3000)
	public void testCase9() {
		setInputFileByPath("datastructures/javadequeue/testCase9_input.txt");		
		setOutputFileByPath("datastructures/javadequeue/testCase9_output.txt");
		test.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}

}
