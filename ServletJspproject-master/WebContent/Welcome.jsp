<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<%!String username=null; %>
<%
try{
 username = session.getAttribute("user").toString();
}catch(Exception e)
{
	username =null;
}
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);
if(username == null)
{
	response.sendRedirect("Home.jsp");
}
%>
</head>
<body>
<h1>Welcome <%=username %></h1>
<form action="LogOut" method="get">
<input type="submit" value="Logout">
</form>
</body>
</html>