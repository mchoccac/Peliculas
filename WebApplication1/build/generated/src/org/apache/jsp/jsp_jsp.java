package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.text.SimpleDateFormat;

public final class jsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\t<html>\n");
      out.write("\t\t<head>\n");
      out.write("                    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t\t<!-- Bootstrap -->\n");
      out.write("\t\t    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("\t\t    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("\t\t    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t\t<!-- /Bootstrap -->\n");
      out.write("                    <title>SACATUN</title>\n");
      out.write("\t\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<!-- navbar -->\n");
      out.write("                <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\"></a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"nuevaGrafica.jsp\">Añadir película</a></li>\n");
      out.write("                        <li><a href=\"modificarGrafica.jsp\">Modificar película</a></li>\n");
      out.write("                        <li><a href=\"borrarGrafica.jsp\">Borrar película</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("\t\t<!-- /navbar -->\n");
      out.write("\t\t<!-- container -->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"page-header\">\n");
      out.write("\t \t\t\t <h1>¿Dónde ver mi pelicula favorita?</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"panel panel-primary\">\n");
      out.write("\t\t\t\t<!-- Table -->\n");
      out.write("\t\t\t\t<table class=\"table table-striped table-responsive table table-hover\">\n");
      out.write("\t\t\t\t\t<tr class=\"panel-primary\">\n");
      out.write("                                                <th>\n");
      out.write("                                                    Película\n");
      out.write("                                                </th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\tDescripción\n");
      out.write("\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\tFecha\n");
      out.write("\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\tLugar\n");
      out.write("\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\tCiudad\n");
      out.write("\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\tAcciones\n");
      out.write("\t\t\t\t\t\t</th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                            ");

                                                Class.forName("com.mysql.jdbc.Driver");
                                                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudcine", "root", "");
                                                Statement c = conexion.createStatement();
                                                ResultSet listacine = c.executeQuery 
                                                ("SELECT * FROM cine JOIN (cine_peli JOIN pelicula on cine_peli.codpeli=pelicula.codpeli) on cine.codcine=cine_peli.codcine");
                                                int repetida = -1;
                                                while (listacine.next()) {
                                                    if (repetida != listacine.getInt("codpeli")) {
                                                    out.println("<td>"+ listacine.getString("nompeli") + "</td>");
                                                    out.println("<td>"+ listacine.getString("despeli") + "</td>");
                                                    } else {
                                                    out.println("<td></td><td></td>");
                                                    }
                                                    if (listacine.getDate("fecha") == null) {
                                                      out.println("<td></td>");
                                                    } else if (listacine.getDate("fecha") != null) {
                                                      out.println("<td>"+ listacine.getDate("fecha") + "</td>");
                                                    }
                                                    out.println("<td>"+ listacine.getString("nomcine") + "</td>");
                                                    out.println("<td>" + listacine.getString("ciucine") + "</td>");
                                                    
      out.write("\n");
      out.write("                                                    <td><div class=\"row\">\n");
      out.write("                                                <div class=\"col-md-3\">\n");
      out.write("                                                    <form method=\"get\" action=\"insertarGrafica.jsp\">\n");
      out.write("                                                        <input type=\"hidden\" name=\"codcine\" value=\"");
      out.print(listacine.getInt("codcine") );
      out.write("\">\n");
      out.write("                                                        <input type=\"hidden\" name=\"nomcine\" value=\"");
      out.print(listacine.getString("nomcine") );
      out.write("\">\n");
      out.write("                                                        <input type=\"hidden\" name=\"ciucine\" value=\"");
      out.print(listacine.getString("ciucine") );
      out.write("\">\n");
      out.write("                                                        <button type=\"submit\"  class=\"btn btn-success\">\n");
      out.write("                                                            <span class=\"glyphicon glyphicon-plus\"></span>\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-2\">\n");
      out.write("                                                    <form method=\"get\" action=\"modificarGrafica.jsp\">\n");
      out.write("                                                        <input type=\"hidden\" name=\"ID\" value=\"");
      out.print(listacine.getString("codcine") );
      out.write("\"/>\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-warning\">\n");
      out.write("                                                            <span class=\"glyphicon glyphicon-pencil\"></span>\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-1\">\n");
      out.write("                                                    <form method=\"get\" action=\"borrarGrafica.jsp\">\n");
      out.write("                                                        <input type=\"hidden\" name=\"ID\" value=\"");
      out.print(listacine.getString("codcine") );
      out.write("\"/>\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-danger\">\n");
      out.write("                                                            <span class=\"glyphicon glyphicon-trash\"></span>\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </form>\n");
      out.write("                                                </div>  \n");
      out.write("                                            </div>\n");
      out.write("                                            </td></tr>\n");
      out.write("                                             ");

                                               repetida = listacine.getInt("codpeli");
                                                }
                                                conexion.close();
                                            
      out.write("\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"height:50px\"></div>\n");
      out.write("\t\t<div class=\"well\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-offset-10\">\n");
      out.write("                                <p><strong>David Balsas Martín</p>\n");
      out.write("                            </div>\n");
      out.write("                    \n");
      out.write("                        </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
