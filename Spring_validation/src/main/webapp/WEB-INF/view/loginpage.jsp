<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="form" %> --%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
    </head>
    <body>
        <div align="center"><br><br>
            <h1>Login Page</h1><br><br>
  			<a href="${pageContext.request.contextPath}/CreateUser">Create New User</a><br>
  			 <a href="${pageContext.request.contextPath}/">Home Page</a><br><br><br> <br><br> 			

				  <h4 style="color: red">${login_error }</h4>
  	         
           <form:form  action="${pageContext.request.contextPath}/UserLoginPage" method="post" modelAttribute="UserInformationPojo1">
            <table border="1">
                <tr>
                    <td>ID :</td> 
                    <th><input type="text" name="user_id" /></th>        
                </tr>            
                <tr>
      
                    <td>Password :</td> 
                    <th><input type="password" name="user_password"/></th>     
                </tr>            
                <tr>
                    <td>Submit :</td> 
                    <th><input type="submit"></th>       
                </tr>            
            </table><br>
            <form:errors style="color: red" path="user_id" /> <br>
            <form:errors style="color: red" path="user_password" /> 
           
           </form:form>          
           
        </div>
    </body>
</html>