<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.c1
{ 
   border:solid; 
   width:180px;
   height:30px;
   padding-bottom:20px;
   margin-top:30px;
   margin-bottom:20px;
}
 </style>

</head>

<body>
   <h1><% String msg= (String)request.getAttribute("msg"); %></h1>
	<form style="border: solid; width: 300px; height: 310px ;padding-bottom:20px;" >
		<div align="center">
		<div class="c1">
			<a href="Login.jsp">Login</a>
		</div>
		<div class="c1">
			<a href="Registration.jsp">Registration</a>

		</div>
		<div class="c1">
			<a href="ChangePassword.jsp">Forget Password</a>
		</div>
		</div>
	</form>
</body>
</html>