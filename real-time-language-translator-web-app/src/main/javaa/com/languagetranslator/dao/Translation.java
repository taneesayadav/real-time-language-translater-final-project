package com.languagetranslator.dao;

public class Translation {
    private int id;
    private String originalText;
    private String translatedText;
    private String sourceLang;
    private String targetLang;

    // Getters
    public int getId() {
        return id;
    }

    public String getOriginalText() {
        return originalText;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public String getSourceLang() {
        return sourceLang;
    }

    public String getTargetLang() {
        return targetLang;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    public void setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
    }

    public void setTargetLang(String targetLang) {
        this.targetLang = targetLang;
    }

    @Override
    public String toString() {
        return "Translation [id=" + id + ", originalText=" + originalText + ", translatedText=" + translatedText
                + ", sourceLang=" + sourceLang + ", targetLang=" + targetLang + "]";
    }
}
