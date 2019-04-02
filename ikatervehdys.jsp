<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
<p>Hei <c:out value="${username}"></c:out> Olet <c:out value="${userage}"></c:out> vuotta vanha!</p>
<p>Olet <c:out value="${ofAge}"></c:out></p>
</body>
</html>
