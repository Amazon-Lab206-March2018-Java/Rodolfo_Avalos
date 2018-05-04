<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="static/css/display.css" rel="stylesheet" type="text/css">
	<title>A web page</title>
</head>
<body>
	<% int rows = Integer.parseInt(request.getParameter ("width"));
	int columns = Integer.parseInt(request.getParameter ("height")); %>
	<h5>Your checkerboard: <%= columns %>w x <%= rows %>h </h5>
	<% for (int x = 0; x<rows; x++) {
		%><div id="wrap"><%
		if (x%2 == 0) {
			for (int j=1; j<=columns; j++) {
				if (j%2 == 1) { %>
					<div class = "square one"></div>
				<% } else { %>
					<div class = "square two"></div>
				<% } %>
			<% } %>
		<% } else { %>
			<% for (int j=0; j<columns; j++) {
				   if (j%2 == 1) { %>
				   		<div class = "square one"></div>
				   <% } else { %>
			       		<div class = "square two"></div>
				   <% } %>
			<% } %>
		<% } %>
		</div>
	<% } %>
</body>
</html>