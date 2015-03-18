package com.gtranslate.text;

public class TextTranslate {
	private Text input;
	private Text output;

	public TextTranslate(Text input, String loutput) {
		this.input = input;
		output = new Text(loutput);
	}

	public TextTranslate(Text input, Text output) {
		this.input = input;
		this.output = output;
	}

	public Text getInput() {
		return input;
	}

	public Text getOutput() {
		return output;
	}
}
