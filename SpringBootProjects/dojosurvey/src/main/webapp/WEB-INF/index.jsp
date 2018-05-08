<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dojo Survey Index</title>
</head>
<body>
    <form action="/survey" method="post">
    <p>Your Name<input type="text" name="name" id="name"></p>
    <p>Dojo Location:
            <select name="location" id="location">
                <option value="SanJose">San Jose</option>
                <option value="Arizona">Arizona</option>
                <option value="Seattle">Arizona</option>
            </select>
        </p>
        <p>Favorite Language:
            <select name="language" id="language">
                <option value="Python">Python</option>
                <option value="Javascript">Javascript</option>
                <option value="Ruby">Java</option>
                <option value="Ruby">Ruby</option>
            </select>
        </p>
        <p><textarea name="comment" id="" cols="30" rows="10"></textarea></p>
        <input type="submit" value="submit">
    </form>
</body>
</html>