package org.antlr.v4.test.runtime.java;

public class LexerTestMethod extends JUnitTestMethod {

	public String[] outputLines;
	public boolean lexerOnly = true;
	public boolean showDFA = false;

	public LexerTestMethod(String name, String grammarName, String input,
			String expectedOutput, String expectedErrors, Integer index) {
		super(name, grammarName, input, expectedOutput, expectedErrors, index);
		outputLines = expectedOutput.split("\n");
		for(int i=0;i<outputLines.length;i++)
			outputLines[i] = Generator.escape(outputLines[i]);
	}

}
