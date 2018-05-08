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
    <div class="container">
    <p>Your Gold: <span class="gold"><c:out value="${gold}"/></span><button><a href="/clear">Start again.</a></button></p>
        <div class="block">
            <form action="/process" method="post">
            <input type="hidden" name="building" value="farm">
            <h4>Farm</h4>
            <p>(Earns 10-20 gold)</p>
            <button type="submit">Find Gold</button>
            </form>
        </div>
        <div class="block">
            <form action="/process" method="post">
            <input type="hidden" name="building" value="cave">
            <h4>Cave</h4>
            <p>(Earns 5-10 gold)</p>
            <button type="submit">Find Gold</button>
            </form>
        </div>
        <div class="block">
            <form action="/process" method="post">
            <input type="hidden" name="building" value="house">
            <h4>House</h4>
            <p>(Earns 2-5 gold)</p>
            <button type="submit">Find Gold</button>
            </form>
        </div>
        <div class="block">
            <form action="/process" method="post">
            <input type="hidden" name="building" value="casino">
            <h4>Casino</h4>
            <p>(Earns/takes 0-50 gold)</p>
            <button type="submit">Find Gold</button>
            </form>
        </div>
        <div>
            <p>Activities:</p>
            <div class="activities">
                <c:forEach var = "log" items="${activities}">
                    <c:out value="${log}"/>
                </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>