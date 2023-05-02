<!DOCTYPE html>
<html>
<head>
<title>Home page</title>
<link rel="stylesheet" type="txt/css" href="Home.css">
<script>
   function validation()
   {  
	  var name=document.getElementById("name").value;  
	  var email=document.getElementById("email").value;	  
	  var password=document.getElementById("password").value;	  
	  var confmpass=document.getElementById("confmpassword").value;	  
     var status= isvalid(name);     
     if(status)
     {       
   	 var ismail =isEmailvalid()
   	  if(ismail)
   	  {  
   		  var ispass=isPassValid();
   		   if(ispass)    			      			   
   			{  
   			   var isConfmpass=isconfmPassValid();
   			   if(isConfmpass)
   				 {    				   
   			            var  isMatch = isMatchPass();
   			             if(isMatch)
   				       {  alert("your Registration is successfull you can login now");
   				           return true;
   				       }else { return false };
   				
   				   } else { return false };
   			}
   		   else { return false };  		   
   	  }
   	  else { return false };
     }
     else { return false };
     
     
   	 function isvalid()
   	 {
   		 if(name=="")
   		  { 
   			 alert("please fill the user name field");
   		   // document.getElementById("username").innerHTML="please fill this field";
   	       	return false;
   		  }
   		 else 
   			 return true;			
   	 }
   	 
   	 
   	 function isEmailvalid()
   	 {
   		 if(email=="")
   		  {   	
   			alert("please Fill the Email Field");
   		    //document.getElementById("emailid").innerHTML="please fill this field";
   	       	return false;
   		  }
   		 else 
   			 return true;			
   	 }

   	 
   	 function isPassValid()
   	 {
    	     if(password.length<3)
    	     {  alert("please Enter the password length should be Greater than three");
    	        //document.getElementById("pass").innerHTML="please fill this field";	 
    	        return false;
    	     }
    	     else
    	    	 return true;
   	 }
   	 
   	
   	
    function isconfmPassValid()
  	 {
   	     if(password.length<3)
   	     {  alert("pease Enter the confirm password field");
   	       
   	        return false;
   	     }
   	     else
   	    	 return true;
  	 }
    
   	 function isMatchPass()
   	 {  
   		 if(password!=confmpass)
   		 {  alert("please RE-Enter the password field");
       			 document.getElementById("pass").innerHTML="password incorrect";
   	   	         document.getElementById("confpass").innerHTML="password incorrect";
   	   	         return false;
   		 }
   		 else
   			 return true;  			 
   	 }
	   if(name==''||email==''||password==''||confmpass=='')
		 {   
		    return false;
		 }      
   }
</script>

<style>
.c1
{ 
   border:solid; 
   width:200px;
   height:30px;
   padding-bottom:30px;
   margin-top:30px;
   margin-bottom:40px;
}
.div{
	display:flex;
	justify-content:center;
	
}
</style>
</head>
<body class="div">
<form  action="RegisterServlet" method="post" name="myForm" onsubmit="return validation()" style="border:solid black ;width:300px; height:500px;">
	<div align="center">
		 <div class="c1">
			<label>Name:</label> 
			<input type="text"  placeholder="User  full name" id="name" name="username"  autocomplete="off">
		    <span id="username" style="color:red"> </span>
		</div>
		<div class="c1">
			<label>EmailID:</label> 
			<input type="email" placeholder="Email ID" id="email" name="emailid" autocomplete="off">
		     <span id="emailid" style="color:red"> </span>
		</div>
		<div class="c1">
			<label>PassWord:</label> 
			<input type="password"placeholder="Enter New password" id="password" name="upass"  autocomplete="off">
			<span id="pass" style="color:red"> </span>
		</div>
		
      	<div class="c1">
			<label> confirm PassWord:</label>
			 <input type="password"placeholder="Enter Confirm password" id="confmpassword" name="confmpass"  autocomplete="off">
			<span id="confpass" style="color:red"> </span>
		</div>
		 
     		
		
			<button type="submit" value="Register" id="submit" style="background-color:#4CAF50;color:white;width:200px;height:30px; font-size:20px;">Registration</button>
	</div>
	

</form>
</body>
</html>