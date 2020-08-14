package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Alumno;
import java.util.List;
import Design.IAlumnoDAO;
import Factory.FactoryDAO;

public final class cursos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" href=\"img/icon.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.css\" >\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estandar.css\">\n");
      out.write("    \n");
      out.write("        <title>Alumnos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession sesion=request.getSession();
            
         
      out.write("\n");
      out.write("        <div class=\"container-fluid content \">\n");
      out.write("            <div class=\"row \">\n");
      out.write("                <header class=\"col-12  bg-dark row justify-content-between mx-0 header-content\">\n");
      out.write("                \n");
      out.write("                </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <main class=\"container bg-light main-content \"> \n");
      out.write("                    <div class=\"row py-3 px-3\">\n");
      out.write("                        <div class=\"col-12  py-4 px-5 result-content bg-white\">\n");
      out.write("                            <div class=\"row justify-content-between px-2\">\n");
      out.write("                                <div class=\" col-8\">\n");
      out.write("                                    <h5 class=\"mt-3\">CURSOS :</h5>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\" col-1\">\n");
      out.write("                                    <button class=\"btn btn-success\" data-toggle=\"modal\" data-target=\"#modal-default\">NUEVO</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 bg-white mt-4 py-4 px-5 result-content mb-5 \" id=\"listaRecursos\">\n");
      out.write("\n");
      out.write("                            <div class=\"row justify-content-center \" id=\"listaCursos\">\n");
      out.write("                                <div class=\"col-11 curso py-2 my-1\">\n");
      out.write("                                    <h4>ALGEBRA</h4>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-11 curso py-2 my-1\">\n");
      out.write("                                    <h4>ARITMETICA</h4>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-11 curso py-2 my-1\">\n");
      out.write("                                    <h4>RAZONAMIENTO VERBAL</h4>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-11 curso py-2 my-1\">\n");
      out.write("                                    <h4>HISTORIA</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal fade\" id=\"modal-default\">\n");
      out.write("                        <div class=\"modal-dialog \">\n");
      out.write("                            <div class=\"modal-content \">\n");
      out.write("                                    <div class=\"modal-header \">\n");
      out.write("                                            <h5 class=\"modal-title\">Nuevo Curso</h5>\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                            </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <form class=\"form-horizontal px-3\" id=\"frm-clases\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"id\" style=\"display:none;\">\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"curso\" class=\"col-sm-3 control-label\">Curso</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"curso\" placeholder=\"INGRESAR EL CURSO\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"modal-footer row justify-content-between\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-warning \" id=\"btn-cancelar\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-success\" id=\"btn-guardar\" >Guardar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.modal-content -->\n");
      out.write("                        </div>\n");
      out.write("                    <!-- /.modal-dialog -->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </main>\n");
      out.write("\n");
      out.write("                <footer class=\"footer-content col-12 text-light \">\n");
      out.write("                    <span>&copy;2020 WorkFast</span>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/header.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
