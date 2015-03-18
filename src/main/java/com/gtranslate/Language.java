package com.gtranslate;

import java.util.HashMap;

public class Language {
	public static final String AFRIKAANS = "af";
	public static final String ALBANIAN = "sq";
	public static final String ARABIC = "ar";
	public static final String ARMENIAN = "hy";
	public static final String AZERBAIJANI = "az";
	public static final String BASQUE = "eu";
	public static final String BELARUSIAN = "be";
	public static final String BENGALI = "bn";
	public static final String BULGARIAN = "bg";
	public static final String CATALAN = "ca";
	public static final String CHINESE = "zh-CN";
	public static final String CROATIAN = "hr";
	public static final String CZECH = "cs";
	public static final String DANISH = "da";
	public static final String DUTCH = "nl";
	public static final String ENGLISH = "en";
	public static final String ESTONIAN = "et";
	public static final String FILIPINO = "tl";
	public static final String FINNISH = "fi";
	public static final String FRENCH = "fr";
	public static final String GALICIAN = "gl";
	public static final String GEORGIAN = "ka";
	public static final String GERMAN = "de";
	public static final String GREEK = "el";
	public static final String GUJARATI = "gu";
	public static final String HAITIAN_CREOLE = "ht";
	public static final String HEBREW = "iw";
	public static final String HINDI = "hi";
	public static final String HUNGARIAN = "hu";
	public static final String ICELANDIC = "is";
	public static final String INDONESIAN = "id";
	public static final String IRISH = "ga";
	public static final String ITALIAN = "it";
	public static final String JAPANESE = "ja";
	public static final String KANNADA = "kn";
	public static final String KOREAN = "ko";
	public static final String LATIN = "la";
	public static final String LATVIAN = "lv";
	public static final String LITHUANIAN = "lt";
	public static final String MACEDONIAN = "mk";
	public static final String MALAY = "ms";
	public static final String MALTESE = "mt";
	public static final String NORWEGIAN = "no";
	public static final String PERSIAN = "fa";
	public static final String POLISH = "pl";
	public static final String PORTUGUESE = "pt";
	public static final String ROMANIAN = "ro";
	public static final String RUSSIAN = "ru";
	public static final String SERBIAN = "sr";
	public static final String SLOVAK = "sk";
	public static final String SLOVENIAN = "sl";
	public static final String SPANISH = "es";
	public static final String SWAHILI = "sw";
	public static final String SWEDISH = "sv";
	public static final String TAMIL = "ta";
	public static final String TELUGU = "te";
	public static final String THAI = "th";
	public static final String TURKISH = "tr";
	public static final String UKRAINIAN = "uk";
	public static final String URDU = "ur";
	public static final String VIETNAMESE = "vi";
	public static final String WELSH = "cy";
	public static final String YIDDISH = "yi";
	public static final String CHINESE_SIMPLIFIED = "zh-CN";
	public static final String CHINESE_TRADITIONAL = "zh-TW";
	private static Language language;
	private HashMap<String, String> hashLanguage;

	private Language() {
		hashLanguage = new HashMap<String, String>();
		init();
	}

	public synchronized static Language getInstance() {
		if (language == null) {
			language = new Language();
		}
		return language;
	}

	private void init() {
		hashLanguage.put("af", "AFRIKAANS");
		hashLanguage.put("sq", "ALBANIAN");
		hashLanguage.put("ar", "ARABIC");
		hashLanguage.put("hy", "ARMENIAN");
		hashLanguage.put("az", "AZERBAIJANI");
		hashLanguage.put("eu", "BASQUE");
		hashLanguage.put("be", "BELARUSIAN");
		hashLanguage.put("bn", "BENGALI");
		hashLanguage.put("bg", "BULGARIAN");
		hashLanguage.put("ca", "CATALAN");
		hashLanguage.put("zh-CN", "CHINESE");
		hashLanguage.put("hr", "CROATIAN");
		hashLanguage.put("cs", "CZECH");
		hashLanguage.put("da", "DANISH");
		hashLanguage.put("nl", "DUTCH");
		hashLanguage.put("en", "ENGLISH");
		hashLanguage.put("et", "ESTONIAN");
		hashLanguage.put("tl", "FILIPINO");
		hashLanguage.put("fi", "FINNISH");
		hashLanguage.put("fr", "FRENCH");
		hashLanguage.put("gl", "GALICIAN");
		hashLanguage.put("ka", "GEORGIAN");
		hashLanguage.put("de", "GERMAN");
		hashLanguage.put("el", "GREEK");
		hashLanguage.put("gu", "GUJARATI");
		hashLanguage.put("ht", "HAITIAN_CREOLE");
		hashLanguage.put("iw", "HEBREW");
		hashLanguage.put("hi", "HINDI");
		hashLanguage.put("hu", "HUNGARIAN");
		hashLanguage.put("is", "ICELANDIC");
		hashLanguage.put("id", "INDONESIAN");
		hashLanguage.put("ga", "IRISH");
		hashLanguage.put("it", "ITALIAN");
		hashLanguage.put("ja", "JAPANESE");
		hashLanguage.put("kn", "KANNADA");
		hashLanguage.put("ko", "KOREAN");
		hashLanguage.put("la", "LATIN");
		hashLanguage.put("lv", "LATVIAN");
		hashLanguage.put("lt", "LITHUANIAN");
		hashLanguage.put("mk", "MACEDONIAN");
		hashLanguage.put("ms", "MALAY");
		hashLanguage.put("mt", "MALTESE");
		hashLanguage.put("no", "NORWEGIAN");
		hashLanguage.put("fa", "PERSIAN");
		hashLanguage.put("pl", "POLISH");
		hashLanguage.put("pt", "PORTUGUESE");
		hashLanguage.put("ro", "ROMANIAN");
		hashLanguage.put("ru", "RUSSIAN");
		hashLanguage.put("sr", "SERBIAN");
		hashLanguage.put("sk", "SLOVAK");
		hashLanguage.put("sl", "SLOVENIAN");
		hashLanguage.put("es", "SPANISH");
		hashLanguage.put("sw", "SWAHILI");
		hashLanguage.put("sv", "SWEDISH");
		hashLanguage.put("ta", "TAMIL");
		hashLanguage.put("te", "TELUGU");
		hashLanguage.put("th", "THAI");
		hashLanguage.put("tr", "TURKISH");
		hashLanguage.put("uk", "UKRAINIAN");
		hashLanguage.put("ur", "URDU");
		hashLanguage.put("vi", "VIETNAMESE");
		hashLanguage.put("cy", "WELSH");
		hashLanguage.put("yi", "YIDDISH");
		hashLanguage.put("af", "AFRIKAANS");
		hashLanguage.put("sq", "ALBANIAN");
		hashLanguage.put("ar", "ARABIC");
		hashLanguage.put("hy", "ARMENIAN");
		hashLanguage.put("az", "AZERBAIJANI");
		hashLanguage.put("eu", "BASQUE");
		hashLanguage.put("be", "BELARUSIAN");
		hashLanguage.put("bn", "BENGALI");
		hashLanguage.put("bg", "BULGARIAN");
		hashLanguage.put("ca", "CATALAN");
		hashLanguage.put("zh-CN", "CHINESE_SIMPLIFIED");
		hashLanguage.put("zh-TW", "CHINESE_TRADITIONAL");
		hashLanguage.put("hr", "CROATIAN");
		hashLanguage.put("cs", "CZECH");
		hashLanguage.put("da", "DANISH");
		hashLanguage.put("nl", "DUTCH");
		hashLanguage.put("et", "ESTONIAN");
		hashLanguage.put("tl", "FILIPINO");
		hashLanguage.put("fi", "FINNISH");
		hashLanguage.put("fr", "FRENCH");
		hashLanguage.put("gl", "GALICIAN");
		hashLanguage.put("ka", "GEORGIAN");
		hashLanguage.put("de", "GERMAN");
		hashLanguage.put("el", "GREEK");
		hashLanguage.put("gu", "GUJARATI");
		hashLanguage.put("ht", "HAITIAN_CREOLE");
		hashLanguage.put("iw", "HEBREW");
		hashLanguage.put("hi", "HINDI");
		hashLanguage.put("hu", "HUNGARIAN");
		hashLanguage.put("is", "ICELANDIC");
		hashLanguage.put("id", "INDONESIAN");
		hashLanguage.put("ga", "IRISH");
		hashLanguage.put("it", "ITALIAN");
		hashLanguage.put("ja", "JAPANESE");
		hashLanguage.put("kn", "KANNADA");
		hashLanguage.put("ko", "KOREAN");
		hashLanguage.put("la", "LATIN");
		hashLanguage.put("lv", "LATVIAN");
		hashLanguage.put("lt", "LITHUANIAN");
		hashLanguage.put("mk", "MACEDONIAN");
		hashLanguage.put("ms", "MALAY");
		hashLanguage.put("mt", "MALTESE");
		hashLanguage.put("no", "NORWEGIAN");
		hashLanguage.put("fa", "PERSIAN");
		hashLanguage.put("pl", "POLISH");
		hashLanguage.put("pt", "PORTUGUESE");
		hashLanguage.put("ro", "ROMANIAN");
		hashLanguage.put("ru", "RUSSIAN");
		hashLanguage.put("sr", "SERBIAN");
		hashLanguage.put("sk", "SLOVAK");
		hashLanguage.put("sl", "SLOVENIAN");
		hashLanguage.put("es", "SPANISH");
		hashLanguage.put("sw", "SWAHILI");
		hashLanguage.put("sv", "SWEDISH");
		hashLanguage.put("ta", "TAMIL");
		hashLanguage.put("te", "TELUGU");
		hashLanguage.put("th", "THAI");
		hashLanguage.put("tr", "TURKISH");
		hashLanguage.put("uk", "UKRAINIAN");
		hashLanguage.put("ur", "URDU");
		hashLanguage.put("vi", "VIETNAMESE");
		hashLanguage.put("cy", "WELSH");
		hashLanguage.put("yi", "YIDDISH");
	}

	public String getNameLanguage(String prefixLanguage) {
		return hashLanguage.get(prefixLanguage);
	}

	public String getNameLanguage(String prefixLanguage, String outputLanguage) {

		Translator translate = Translator.getInstance();
		return translate.translate(hashLanguage.get(prefixLanguage),
				prefixLanguage, outputLanguage);

	}
}
