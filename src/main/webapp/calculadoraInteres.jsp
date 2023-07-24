<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Interés Simple</title>
</head>
<body>
    <h1>Calculadora de Interés Simple</h1>
    <form action="calculadoraInteres" method="post">
        <label for="capital">Capital:</label>
        <input type="number" id="capital" name="capital" required><br>

        <label for="tasaInteresAnual">Tasa de Interés Anual (%):</label>
        <input type="number" id="tasaInteresAnual" name="tasaInteresAnual" required><br>

        <label for="años">Número de Años:</label>
        <input type="number" id="años" name="años" required><br>

        <input type="submit" value="Calcular Interés">
    </form>

    <% if (request.getAttribute("interes") != null) { %>
        <h2>Resultado:</h2>
        <p>El interés simple generado es: $<%= request.getAttribute("interes") %></p>
    <% } %>
</body>
</html>
