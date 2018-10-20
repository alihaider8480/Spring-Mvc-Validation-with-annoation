<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
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
  			<h4>${login_error }</h4>
          
    
            <table border="1">
                   
            	<tr>
   	   			    <th>ID :</th>
   	   			    <th>Name :</th>
   	   			    
   	   		    </tr>				
   	        <c:forEach var="var" items="${show_admin_information}">
   	             <tr>
   	                 <td>${var.getUser_id() }</td>
                     <td>${var.getUser_name() }</td>
                     
  	             </tr>
   	             
            </c:forEach> 
            </table>
                 
        </div>
    </body>
</html>