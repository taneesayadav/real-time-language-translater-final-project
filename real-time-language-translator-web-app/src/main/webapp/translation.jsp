<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Real-Time Language Translator</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container my-5">
        <h1 class="text-center mb-4">Real-Time Language Translator</h1>
        
        <div class="mb-3 row">
            <label for="sourceLang" class="col-sm-2 col-form-label">From:</label>
            <div class="col-sm-4">
                <select id="sourceLang" class="form-select">
                    <option value="en">English</option>
                    <option value="fr">French</option>
                    <option value="es">Spanish</option>
                    <option value="de">German</option>
                </select>
            </div>
            
            <label for="targetLang" class="col-sm-2 col-form-label">To:</label>
            <div class="col-sm-4">
                <select id="targetLang" class="form-select">
                    <option value="fr">French</option>
                    <option value="en">English</option>
                    <option value="es">Spanish</option>
                    <option value="de">German</option>
                </select>
            </div>
        </div>
        
        <div class="mb-3">
            <label for="inputText" class="form-label">Input Text:</label>
            <textarea id="inputText" class="form-control" rows="4" placeholder="Type text here..."></textarea>
        </div>
        
        <div class="d-grid">
            <button id="translateButton" class="btn btn-primary btn-lg">Translate</button>
        </div>
        
        <div class="mt-3">
            <label for="outputText" class="form-label">Translated Text:</label>
            <textarea id="outputText" class="form-control" rows="4" placeholder="Translation will appear here..." readonly></textarea>
        </div>
    </div>

    <!-- Bootstrap JavaScript and Dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
