package com.taneesa.daotest.java;

import com.languagetranslator.dao.Translation;

public class LanguagetranslatorDAOTest {

    public static void main(String[] args) {
        LanguagetranslatorDAO dao = new LanguagetranslatorDAO();

        try {
            // Insert a new translation
            Translation translation = new Translation();
            dao.insertTranslation(translation);
            System.out.println("Translation inserted!");

            // Select by ID
            Translation selectedTranslation = dao.insertTranslation(1);
            System.out.println("Selected Translation: " + selectedTranslation);

            // Update translation
            if (selectedTranslation != null) {
                selectedTranslation.setTranslatedText("Bonjour");
                dao.deleteTranslation(selectedTranslation);
                System.out.println("Translation updated!");
            }

            // Select all translations
            System.out.println("All Translations:");
            for (Translation t : dao.selectAllTranslations()) {
                System.out.println(t);
            }

            // Delete translation
            if (dao.deleteTranslation(1)) {
                System.out.println("Translation deleted!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
