<%-- 
    Document   : agecalculator
    Created on : 26-May-2021, 1:26:15 PM
    Author     : brixa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab03</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="ageC" value="${ageCalculator}" placeholder="20">
            <br>
            <input type="submit" value="Age next birthday">
            
        </form>
            <p>${message}</p>
    </body>
</html>
