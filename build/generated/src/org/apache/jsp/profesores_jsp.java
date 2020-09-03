package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Profesor;
import DAO.IProfesorDAO;
import Bean.Alumno;
import java.util.List;
import DAO.IAlumnoDAO;
import Factory.FactoryDAO;

public final class profesores_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Profesores</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession sesion=request.getSession();
            
         
      out.write("\n");
      out.write("        <div class=\"container-fluid content \">\n");
      out.write("            <div class=\"row \">\n");
      out.write("                <header class=\"col-12  bg-dark row justify-content-between mx-0 header-content\">\n");
      out.write("\n");
      out.write("                </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <main class=\"container bg-light main-content \"> \n");
      out.write("                    <div class=\"row py-3 px-3\">\n");
      out.write("                        <div class=\"col-12  py-4 px-5 result-content bg-white\">\n");
      out.write("                            <div class=\"row justify-content-between px-2\">\n");
      out.write("                                <div class=\" col-8\">\n");
      out.write("                                    <h4 class=\"mt-3\">PROFESORES :</h4>\n");
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
      out.write("                            <table class=\"table table-striped\">\n");
      out.write("                                <thead  class=\"thead-dark\">\n");
      out.write("                                  <tr>\n");
      out.write("                                    <th     scope=\"col\">ID</th>\n");
      out.write("                                    <th  scope=\"col\">Nombre</th>\n");
      out.write("                                    <th  scope=\"col\">DNI</th>\n");
      out.write("                                    <th  scope=\"col\">Correo</th>\n");
      out.write("                                    <th  scope=\"col\">Telefono</th>\n");
      out.write("                                    <th  scope=\"col\">Accion</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                  </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    \n");
      out.write("                                ");

                                     
                                    IProfesorDAO profesorDAO = FactoryDAO.getInstance().getProfesorService();
                                    List<Profesor> profesorList=profesorDAO.obtenerProfesores();
                                        
                                     for(int i=0;i<profesorList.size();i++){
                                         
                                           Profesor prof=profesorList.get(i);
                                            
                                
      out.write("        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">1</th>\n");
      out.write("                                            <td>");
      out.print( prof.getNombre() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( prof.getDni() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( prof.getEmail() );
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( prof.getTelefono() );
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <button class=\"btn btn-primary\">Ver</button>\n");
      out.write("                                                <button class=\"btn btn-warning\">Modificar</button>\n");
      out.write("                                                <button class=\"btn btn-danger\">Eliminar</button>\n");
      out.write("                                            </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                          </tr>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                    ");
        
                                            
                                        
                                        }
                                    
                                    
      out.write("\n");
      out.write("                                  \n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                              </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                            <h5 class=\"modal-title\">Nuevo Profesor</h5>\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                            </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <form class=\"form-horizontal px-3\" id=\"frm-clases\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"id\" style=\"display:none;\">\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"usuario\" class=\"col-sm-3 control-label\">Usuario</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"usuario\" placeholder=\"INGRESAR EL USUARIO\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"password\" class=\"col-sm-3 control-label\">Password</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"password\" placeholder=\"INGRESAR EL PASSWORD\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"nombre\" class=\"col-sm-3 control-label\">Nombre</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" style=\"text-transform:uppercase;\"class=\"form-control\" id=\"nombre\" placeholder=\"INGRESAR EL NOMBRE\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"dni\" class=\"col-sm-3 control-label\">DNI</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" style=\"text-transform:uppercase;\"class=\"form-control\" id=\"dni\" placeholder=\"INGRESAR EL DNI\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"correo\" class=\"col-sm-3 control-label\">Correo</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" style=\"text-transform:uppercase;\"class=\"form-control\" id=\"correo\" placeholder=\"INGRESAR EL CORREO\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"telefono\" class=\"col-sm-3 control-label\">Telefono</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" style=\"text-transform:uppercase;\"class=\"form-control\" id=\"telefono\" placeholder=\"INGRESAR EL TELEFONO\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
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
