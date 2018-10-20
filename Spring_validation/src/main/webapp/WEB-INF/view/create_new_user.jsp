<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
    </head>
    <body>
        <div align="center">
        <h1>Create New User</h1><br><br>
        <h3 style="color: red">${insert_new_user_error }</h3>
          <form:form action="${pageContext.request.contextPath}/new_user_data" method="post" modelAttribute="UserInformationPojo2">       
            <table border="1">    
                <tr>
                    <td>ID :</td> 
                    <th><input type="text" name="user_id"></th>       
                </tr>            
                <tr>
                    <td>Password :</td> 
                    <th><input type="text" name="user_password"></th>       
                </tr>
                <tr>
                    <td>Name :</td> 
                    <th><input type="text" name="user_name"></th>       
                </tr>         
                <tr>
                    <td>Email :</td> 
                    <th><input type="text" name="user_email"></th>       
                </tr>        
                <tr>
                    <td>Contact :</td> 
                    <th><input type="text" name="user_contact"></th>       
                </tr>        
                <tr>
                    <td>Address :</td> 
                    <th><input type="text" name="user_address"></th>       
                </tr>        
                <tr>
                    <td>N.I.C :</td> 
                    <th><input type="text" name="user_nic"></th>       
                </tr>        
                
                <tr>
                    <td>Submit :</td> 
                    <th><input type="submit"></th>       
                </tr>            
            </table>
       <br>
           <form:errors style="color: red" path="user_id" /> <br>
       	   <form:errors style="color: red" path="user_password" /><br>
           <form:errors style="color: red" path="user_name" /><br>
           <form:errors style="color: red" path="user_email" /><br>
           <form:errors style="color: red" path="user_contact" /><br>
           <form:errors style="color: red" path="user_address" /><br>
           <form:errors style="color: red" path="user_nic" />
          </form:form><br><br><br>
         <h3><a href="${pageContext.request.contextPath}/LoginPage">Go LoginPage</a></h3>
        </div>
    </body>
</html>