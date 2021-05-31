<%-- 
    Document   : arithmeticcalculator
    Created on : 31-May-2021, 12:52:51 AM
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
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="firstAC" value="${firstNumber}">
            <br>
            <label>Second:</label>
            <input type="text" name="secondAC" value="${secondNumber}">
            <br>
            <input type="button" name="plusButton" value="+" >
            <input type="button" name="minusButton" value="-" >
            <input type="button" name="timesButton" value="*" >
            <input type="button" name="modulusButton" value="%" >
            
        </form>
            
            <a href="age">Age Calculator</a>
    </body>
</html>
