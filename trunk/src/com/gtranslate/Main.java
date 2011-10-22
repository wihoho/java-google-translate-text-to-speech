package com.gtranslate;

import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;

public class Main {
	public static void main(String[] args) throws JavaLayerException, IOException {
		Translator translate = Translator.getInstance();
		Language language = Language.getInstance();
		String text = "Try mWinMgr = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);int displayWidth = mWinMgr.getDefaultDisplay().getWidth();where context is Context instance.By default, the FrameLayout in which your layout is kept, fills the whole display horizontally (vertically you can have status bar). So you can set the maximum possible width by using android:layout_width=\"fill_parent\" correctly.";
		System.out.println(translate.translate(text, Language.ENGLISH,
				Language.PORTUGUESE)
				+ " ");	
		System.out.println(translate.detect(text));
		System.out.println(language.getNameLanguage(translate.detect(text),
				Language.CHINESE_SIMPLIFIED));
		Audio.getInstance().play(Audio.getInstance().getAudio("UHAEUHAUEHAUE", Language.AFRIKAANS));		
	}
}
