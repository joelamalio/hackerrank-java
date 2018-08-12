package br.com.joelamalio.hackerrank.java.datastructures.java1darray;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		setInputFileByPath("datastructures/java-1d-array/testCase0_input.txt");		
		setOutputFileByPath("datastructures/java-1d-array/testCase0_output.txt");
		Solution.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	@Test
	public void testCase1() {
		setInputFileByPath("datastructures/java-1d-array/testCase1_input.txt");
		setOutputFileByPath("datastructures/java-1d-array/testCase1_output.txt");
		Solution.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	@Test
	public void testCase2() {
		setInputFileByPath("datastructures/java-1d-array/testCase2_input.txt");
		setOutputFileByPath("datastructures/java-1d-array/testCase2_output.txt");
		Solution.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	//@Test
	public void testCase3() {
		setInputFileByPath("datastructures/java-1d-array/testCase3_input.txt");
		setOutputFileByPath("datastructures/java-1d-array/testCase3_output.txt");
		Solution.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	//@Test
	public void testCase8() {
		setInputFileByPath("datastructures/java-1d-array/testCase8_input.txt");
		setOutputFileByPath("datastructures/java-1d-array/testCase8_output.txt");
		Solution.main(new String[]{});
		
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
}
