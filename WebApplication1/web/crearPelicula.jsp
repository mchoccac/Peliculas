<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        <%
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudcine", "root", "");
          Statement s = conexion.createStatement();
          s.execute("INSERT INTO peliula (nompeli, despeli) VALUES ('" + request.getParameter("nompeli") + "' , '" + request.getParameter("despeli") + "')");

          s.close();
        %>
        <script>
            document.location = "index.jsp"
        </script>
    </body>
</html>
