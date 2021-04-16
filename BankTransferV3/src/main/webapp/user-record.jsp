<%-- 
    Document   : user-record
    Created on : Apr 13, 2021, 6:18:57 PM
    Author     : rrolle
--%>

<%@page import="com.rrolle.banktransferv3.models.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Record</title>
    </head>
    <body>
    <%
        String outId;
        if (request.getAttribute("id") == null) {
            outId = "ID is undefined";
        } else {
            int id = (int) request.getAttribute("id");            
            outId = "ID is " + id;
        }

    %>
    <div>Student ID: <%= outId %></div>
    <%
        if (request.getAttribute("userRecord") != null) {
            User user = (User) request.getAttribute("userRecord");
    %>
 
    <h1>User Record</h1>
    <div>ID: <%= user.getId()%></div>
    <div>First Name: <%= user.getFname()%></div>
    <div>Last Name: <%= user.getLname()%></div>
        
    <% 
        } else { 
    %>

    <h1>No user record found.</h1>
         
    <% } %>	
    </body>
</html>
