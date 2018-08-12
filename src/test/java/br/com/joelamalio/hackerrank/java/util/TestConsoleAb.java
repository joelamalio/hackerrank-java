package br.com.joelamalio.hackerrank.java.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public abstract class TestConsoleAb {

	protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected ByteArrayInputStream inContent;
	protected StringBuilder input;
	protected StringBuilder output;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    input = new StringBuilder();
	    output = new StringBuilder();
	}

	@After
	public void restoreStreams() {
	    System.setOut(System.out);
	    System.setIn(System.in);
	}
	
	protected void setInputFileByPath(String filePath) {
		System.setIn(getInputStream(filePath));
	}
	
	protected void setOutputFileByPath(String filePath) {
		readFile(filePath);
	}
	
	protected void input(String value) {
		input.append(value).append("\n");
	}
	
	protected void output(String value) {
		output.append(value).append("\r\n");
	}
	
	private byte[] readBytesFromFile(String filePath) {
        FileInputStream fis = null;
        byte[] bytes = null;

        try {
            File file = getFile(filePath);
            bytes = new byte[(int) file.length()];
            fis = new FileInputStream(file);
            fis.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return bytes;
    }
	
	private File getFile(String filePath) {
		ClassLoader classLoader = getClass().getClassLoader();
		return new File(classLoader.getResource(filePath).getFile());
	}
	
	private ByteArrayInputStream getInputStream(String filePath) {
		return new ByteArrayInputStream(readBytesFromFile(filePath));
	}
	
	private void readFile(String filePath) {
		try {
		BufferedReader br = new BufferedReader(new FileReader(getFile(filePath)));
		    String line = br.readLine();

		    while (line != null) {
		        output.append(line);
		        output.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    br.close();
		} catch (Exception e) {
		} finally {
		}
	}
	
}
