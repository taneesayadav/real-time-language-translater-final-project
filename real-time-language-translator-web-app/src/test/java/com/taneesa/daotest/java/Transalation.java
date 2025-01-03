package com.taneesa.daotest.java;

import com.languagetranslator.dao.Translation;

public class Transalation {
    public static void main(String[] args) {
        // Create a new Translation object
        Translation translation = new Translation();
        
        // Set values
        translation.setId(1);
        translation.setOriginalText("Hello");
        translation.setTranslatedText("Hola");
        translation.setSourceLang("EN");
        translation.setTargetLang("ES");

        // Test getters
        System.out.println("ID: " + translation.getId());
        System.out.println("Original Text: " + translation.getOriginalText());
        System.out.println("Translated Text: " + translation.getTranslatedText());
        System.out.println("Source Language: " + translation.getSourceLang());
        System.out.println("Target Language: " + translation.getTargetLang());
        
        // Test toString
        System.out.println(translation);
    }
}
