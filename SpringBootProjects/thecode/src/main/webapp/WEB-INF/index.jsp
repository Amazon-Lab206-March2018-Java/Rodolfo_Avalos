<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
    <div class="centered">
       	<c:out value="${errors}"/>
        <p>What is the code?
            <form action="/verify" method="post">
            <input type="text" name="code">
            <input type="submit" value="Try Code"></form>
        </p>
    </div>
</body>
</html>