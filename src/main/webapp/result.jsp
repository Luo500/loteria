<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Ja
  Date: 29.03.2023
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Loteria</title>
</head>
<body>
<%
    ArrayList result = (ArrayList) request.getAttribute("result");
    ArrayList source = (ArrayList) request.getAttribute("source");
    ArrayList randomNumbers = (ArrayList) request.getAttribute("randomNumbers");
    int oneNumber = (int) result.get(1);
    int twoNumber = (int) result.get(2);
    int threeNumber = (int) result.get(3);
    int fourNumber = (int) result.get(4);
    int fiveNumber = (int) result.get(5);
    int sixNumber = (int) result.get(6);
%>


<h2>
    <%= String.format("Wygrane liczby: %x, %x, %x, %x, %x, %x", oneNumber, twoNumber, threeNumber, fourNumber,
            fiveNumber, sixNumber)%>
    <%= String.format("Twoje lizcby: %x, %x, %x, %x, %x, %x", source.get(1), source.get(2), source.get(3),
            source.get(4), source.get(5), source.get(6))%>
    <%= String.format("Liczba trafień: ")%>
</h2>
</body>
</html>
