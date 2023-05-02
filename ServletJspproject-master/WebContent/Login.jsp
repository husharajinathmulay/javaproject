<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Login.jsp</title>
<script>
function validation()
{      var name =document.getElementById("name1").value;
	   var email= document.getElementById("emailid").value;
	   var pass= document.getElementById("password").value;
	   var status=isNameValidate();	  
	   if(status)
	   { 
		 var isEmail= isEmailValidate()  
	     if(isEmail)
		  {  
		       var ispass=isPasswordValidate()
                if(ispass)	
                {    
                     return true;  	
         		}
         		else
         		{ return false; }
		  }		
	   	else 
		  { return false; }
	 } else{ return false; }
	   
	    function isNameValidate()
	    {
	    	 if(name=='')
	           { alert(" Name field is first");
	    		 document.getElementById("name").innerHTML="invalid username";
	    		 return false;
	           }
	    	 else
	    		 { return true; }
	    }
	   
	   function isEmailValidate()
	   {
		    if(email=='')
		    {  alert("plz fill email field");
		    	document.getElementById("email").innerHTML="invalid emailid";
		    	return false;
		    }
		    else
		    	{
		    	 return true;
		    	}
	   }
	   
	   function isPasswordValidate()
	   {
		   if(pass.length<3)
			{   
			   alert("password length should be greater than 3");
			   document.getElementById("password").innerHTML="invalid password";	
			   return false;
			}
		   else
		   {
			    return true;
		   }
	   }
	   if(name==''||email==''||pass=='')
		 {   
		    return false;
		 }  
   
}
 </script>
 
 <style>
 .c1
{ 
   border:solid; 
   width:180px;
   height:30px;
   padding-bottom:30px;
    margin-top:30px;

   margin-bottom:50px;
}
.div{
	display:flex;
	justify-content:center;
	
}
 </style>
 </head>
<body class="div">
<form action="LoginServlet" method="post" name="loginForm" onsubmit="return validation()" style="border:solid black ;width:300px; height:450px;">
	<div align="center">
	
	
	
	    <div class="c1">
			Name :<input type="text" name="name" placeholder="Enter user name" id="name1" required="required">
			<span id="uname" style="color:red;margin-top:30px;"></span>
		</div>
	
	
		<div class="c1">
			EmaiID :<input type="email" name="email" placeholder="Enter Email id" id="emailid"  required="required">
			<span id="email" style="color:red;margin-top:30px;"></span>
		</div>
		<div class="c1">
			Password:<input type="password" name="password" placeholder="Enter pssword" id="password"  required="required">
		    <span id="passwordspan" style="color:red;"></span>
		</div>
		<button type="submit" value="Login" style="background-color:light-blue; color:red; width:200px; hight:50px;">login</button>
		
	</div>
</form>
</body>
</html>