package br.com.joelamalio.hackerrank.java.strings.validusernamechecker;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {

	@Test
	public void testCase0() {
		input("8");
		input("Julia");
		input("Samantha");
		input("Samantha_21");
		input("1Samantha");
		input("Samantha?10_2A");
		input("JuliaZ007");
		input("Julia@007");
		input("_Julia007");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("Invalid");
		output("Valid");
		output("Valid");
		output("Invalid");
		output("Invalid");
		output("Valid");
		output("Invalid");
		output("Invalid");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
}
