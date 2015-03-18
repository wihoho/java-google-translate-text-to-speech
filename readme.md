### Introduction

This is project is exported from [java-google-translate-text-to-speech](https://code.google.com/p/java-google-translate-text-to-speech/),and it provides a wrapper of Google Translate with the following functions:

1. Translate text from one language to another language
2. Detect the language of given texts
3. text-to-speech

### Contributions by the author

1. Convert the original eclipse-based project to a maven project
2. Fix the non-working detection component

### Usages of this project
You may refer to the below test cases for the usage.

```java
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
```

### References
1. [java-google-translate-text-to-speech](https://code.google.com/p/java-google-translate-text-to-speech/)
2. [goslate](https://pypi.python.org/pypi/goslate)




