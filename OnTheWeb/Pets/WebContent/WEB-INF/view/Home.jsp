<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Make a pet</title>
</head>
<body>
    <div>
        <h5>Make a Dog!</h5>
        <form action="Dogs" method="post">
            <p>Name<input type="text" name="dog_name"></p>
            <p>Breed<input type="text" name="dog_breed"></p>
            <p>Weight (lb)<input type="text" name="weight" id=""></p>
            <input type="submit" value="Submit your dog">
        </form>
    </div>
    <div>
        <h5>Make a Cat!</h5>
        <form action="Cats" method="post">
            <p>Name<input type="text" name="cat_name"></p>
            <p>Breed<input type="text" name="cat_breed"></p>
            <p>Weight (lb)<input type="text" name="weight" id=""></p>
            <input type="submit" value="Submit your dog">
        </form>
    </div>
</body>
</html>