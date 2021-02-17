<%-- 
    Document   : editnote
    Created on : Feb 9, 2021, 4:28:20 PM
    Author     : 735815
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notes</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        
        <form method="POST" action="note">
            
            <p>Title:
                <input type ="textarea" name="titlehere"   value="${note.title}" rows="1" cols="20"></p>

           <p>Contents:
               <textarea name="commentshere"  value="${note.comments}" rows="5" cols="25"></textarea></p>
              
            <a href="note">
                <button>Save
                </button>
            </a>           
        </form>
        
    </body>