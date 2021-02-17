<%-- 
    Document   : viewnote
    Created on : Feb 9, 2021, 4:28:02 PM
    Author     : 735815
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head> 
    
    <body>
 <h1>Simple Note Keeper</h1>  
  <h2>View Note</h2> 

  <strong><p>Title: </strong> ${note.title}</p>

    <strong><p>Contents: </strong> ${note.comments}</p>    
      <a href="note?edit">Edit</a>        
    </body>
</html>
