<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
<script>
   function validation()
   {
	   var email= document.getElementById("emailid").value;
	   var pass=document.getElementById("passwrd").value;
	   var emailid=isEmailValidate(email);
	   if(emailid)
		{  var password=isPassValid();
		    if(password)
		      {  
		    	 return true;      
		      }
		      return false;
	    }
	   else { return false };
	
	   
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
	   
	   function isPassValid()
	   	 {
	    	     if(pass.length<3)
	    	     { 
	    	    	 alert("please Enter the password length should be Greater than three");
	    	        return false;
	    	     }
	    	     else
	    	    	 return true;
	   	 }
	 
   }
 </script>
 
 <style>
    .c1
    {
       border:solid;
        height:50px;
        width:300px;
        
    .div
    {
          border:solid;
          align:center;  
          margin-left:20px;
          margin-right:20px;
    }    
    }
 </style>

</head>
<body>
<form action="PasswordChangeServlet" method="post" onsubmit="return validation()">
	<div align="center" >
		<div class ="c1">
			EmaiID :<input type="text" placeholder="Enter Email id" id="emailid" name="email"><br>
			<span id="email" style="color:red"></span>
		</div >
		<div class ="c1"> 
		   new Password:<input type="password" placeholder="Enter pssword" name="pass"  id="passwrd"><br>
		   
		</div>
		
		
		<div></div>
		<button type="submit" style="background-color:light-blue;" class ="c1"><p style="color:red" >Login</p></button>
	</div>
</form>
</body>
</html>