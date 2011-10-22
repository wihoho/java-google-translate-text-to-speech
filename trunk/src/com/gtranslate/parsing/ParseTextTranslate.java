package com.gtranslate.parsing;

import com.gtranslate.URLCONSTANTS;
import com.gtranslate.text.Text;
import com.gtranslate.text.TextTranslate;
import com.gtranslate.utils.WebUtils;

public class ParseTextTranslate implements Parse {
	private TextTranslate textTranslate;
	private StringBuilder url;

	public ParseTextTranslate(TextTranslate textTranslate) {
		this.textTranslate = textTranslate;
	}

	@Override
	public void parse() {
		appendURL();
		String result = WebUtils.source(url.toString());
		String split[] = result.replace("[", "").replace("]", "").replace("\"",
				"").split(",");
		Text output = textTranslate.getOutput();
		output.setText(split[0]);

	}

	public TextTranslate getTextTranslate() {
		return textTranslate;
	}

	@Override
	public void appendURL() {
		Text input = textTranslate.getInput();
		Text output = textTranslate.getOutput();
		url = new StringBuilder(URLCONSTANTS.GOOGLE_TRANSLATE_TEXT);
		url.append("client=t&text=" + input.getText().replace(" ", "%20"));
		url.append("&hl=" + input.getLanguage());
		url.append("&sl=" + input.getLanguage());
		url.append("&tl=" + output.getLanguage());
		url.append("&multires=1&prev=btn&ssel=0&tsel=0&sc=1");

	}
}
