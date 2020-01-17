<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <link href="favicon.ico" rel="shortcut icon" type=>
        <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <!-- /Bootstrap -->
        <title>CINES</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8");%>

        <!-- container -->
        <div class="container">
            <div class="page-header">
                <h1>Modificar evento</h1>
            </div>
        </div>
        <div class="container">
            <div class="panel panel-primary">
                <form method="get" action="aniadeEvento.jsp">
                    <div class="panel-heading">Modificar evento</div>
                    <div class="panel-body">

                        <div class="row">
                            <input type="hidden" name="codpeli" value="<%=request.getParameter("codpeli") %>"/>
                            <div class="col-md-6">
                                    Nombre película <input class="form-control" type="text" name="nompeli" value="<%= request.getParameter("nompeli") %>" readonly><br>
                                </div>
                                <div class="col-md-6">
                                   Lugar  <input class="form-control" type="text" name="lugar" value="<%= request.getParameter("lugar") %>"/></br>
                                </div>
                                <div class="col-md-6">
                                    Ciudad <input class="form-control" type="text" name="ciudad" value="<%= request.getParameter("ciudad") %>"/></br>
                                </div>
                                <div class="col-md-6">
                                    Fecha <input class="form-control" type="text" name="fecpeli" value="<%= request.getParameter("fecpeli") %>"/></br>
                                </div>
                        </div>
                        <div class="row">
                            <div class="col-md-2">
                                <input class="btn btn-primary" type="submit" value="Aceptar">
                            </div>
                        </div>

                    </div>
                </form>
            </div>




        </div>
    </body>
</html>