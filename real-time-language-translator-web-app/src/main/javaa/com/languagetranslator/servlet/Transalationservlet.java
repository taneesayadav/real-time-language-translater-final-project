package com.languagetranslator.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/translate")
public class Transalationservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve parameters from the request
        String sourceLang = request.getParameter("sourceLang");
        String targetLang = request.getParameter("targetLang");
        String inputText = request.getParameter("inputText");

        // Perform a dummy translation (replace this with actual API logic)
        String translatedText = translateText(inputText, sourceLang, targetLang);

        // Set the response type
        response.setContentType("text/plain");
        response.getWriter().write(translatedText);
    }

    /**
     * Dummy translation logic (replace with actual implementation using an API like Google Translate)
     */
    private String translateText(String inputText, String sourceLang, String targetLang) {
        // This is just a placeholder for demonstration purposes
        return "Translated [" + inputText + "] from " + sourceLang + " to " + targetLang;
    }
}
