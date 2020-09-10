<%-- 
    Document   : logout
    Created on : 02/07/2020, 12:48:36 AM
    Author     : Angelo
--%>

<%@page import="Utils.ConexionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesion=request.getSession();
            sesion.invalidate();
        
        %>
        
        <script src="js/logout.js"></script>
    </body>
</html>
