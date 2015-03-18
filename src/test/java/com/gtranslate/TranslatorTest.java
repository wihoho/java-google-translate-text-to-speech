package com.gtranslate;

import com.google.gson.Gson;
import javazoom.jl.decoder.JavaLayerException;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TranslatorTest {
    Translator translator = Translator.getInstance();

    @Test
    public void testTranslateText() {
        String text = translator.translate("I am programmer", Language.ENGLISH, Language.PORTUGUESE);
        assertEquals("Eu sou programador", text);
    }

    @Test
    public void testDetectLanguage() {
        String language = translator.detect("Hello World");
        assertEquals("en", language);
    }

    @Test
    public void testPlayingAudio() throws IOException, JavaLayerException {
        Audio audio = Audio.getInstance();
        InputStream sound = audio.getAudio("你好世界", Language.CHINESE_SIMPLIFIED);
        audio.play(sound);

        assertTrue(sound != null);
    }

}