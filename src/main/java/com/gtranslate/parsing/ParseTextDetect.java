package com.gtranslate.parsing;

import com.google.gson.Gson;
import com.gtranslate.URLCONSTANTS;
import com.gtranslate.text.Text;
import com.gtranslate.utils.WebUtils;

import java.util.List;
import java.util.Map;

public class ParseTextDetect implements Parse {
    private StringBuilder url;
    private Text input;
    private Gson gson;

    public ParseTextDetect(Text input) {
        this.input = input;
        this.gson = new Gson();
    }

    @Override
    public void appendURL() {

        url = new StringBuilder(URLCONSTANTS.GOOGLE_TRANSLATE_TEXT);
        url.append("text=" + input.getText().replace(" ", "%20"));
        url.append("&oe=UTF-8&");
        url.append("tl=en&");
        url.append("client=z&");
        url.append("sl=&");
        url.append("ie=UTF-8");
    }

    @Override
    public void parse() {

        appendURL();
        String result = WebUtils.source(url.toString());

        Map map = gson.fromJson(result, Map.class);
        String inputLanguage = (String) map.get("src");

        input.setLanguage(inputLanguage);
    }

}
