# Translating a text #
```
Translator translate = Translator.getInstance();
String text = translate.translate("I am programmer", Language.ENGLISH, Language.PORTUGUESE);
System.out.println(text); //Eu sou programador
```

# Detecting a language of a text #
```
Translator translate = Translator.getInstance();
String prefix = translate.detect("I am a bus");
System.out.println(prefix); //en
```
# Taking the a name of a language #
```
Translator translate = Translator.getInstance();
Language language  = Language.getInstance();
String prefixLanguage = translate.detect("I am a bus"); //en
String nameLanguage = language.getNameLanguage(prefixLanguage);
System.out.println(nameLanguage); //ENGLISH
```

# Taking translated name of a language #
```
Translator translate = Translator.getInstance();
Language language  = Language.getInstance();
String prefixLanguage = translate.detect("I am a bus"); //en
String translateLanguage  = language.getNameLanguage(prefixLanguage, Language.PORTUGUESE);
System.out.println(translateLanguage);//INGLES
```
# Playing a translated text #
```
Audio audio = Audio.getInstance();
InputStream sound  = audio.getAudio("I am a bus", Language.ENGLISH);
audio.play(sound);
```


