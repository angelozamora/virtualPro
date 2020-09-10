package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Usuario;
import DAO.IProfesorDAO;
import FactoryImpl.FactoryImpl;
import Bean.Profesor;
import Bean.Alumno;
import java.util.List;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"icon\" href=\"img/escudosm.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.css\" >\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estandar.css\">\r\n");
      out.write("    \r\n");
      out.write("        <title>Profesores</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            HttpSession sesion=request.getSession();
            
         
      out.write("\r\n");
      out.write("        <div class=\"container-fluid content \">\r\n");
      out.write("            <div class=\"row \">\r\n");
      out.write("                <header class=\"col-12  bg-dark row justify-content-between mx-0 header-content\">\r\n");
      out.write("\r\n");
      out.write("                </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <main class=\"container bg-light main-content \"> \r\n");
      out.write("                    <div class=\"row py-3 px-3\">\r\n");
      out.write("                        <div class=\"col-12  py-4 px-5 result-content bg-white\">\r\n");
      out.write("                            <div class=\"row justify-content-between px-2\">\r\n");
      out.write("                                <div class=\" col-8\">\r\n");
      out.write("                                    <h4 class=\"mt-3\">PROFESORES :</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\" col-1\">\r\n");
      out.write("                                    <button class=\"btn btn-success\" data-toggle=\"modal\" data-target=\"#modal-default\">NUEVO</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-12 bg-white mt-4 py-4 px-5 result-content mb-5 \" id=\"listaRecursos\">\r\n");
      out.write("\r\n");
      out.write("                            <table class=\"table table-striped\">\r\n");
      out.write("                                <thead  class=\"thead-dark\">\r\n");
      out.write("                                  <tr>\r\n");
      out.write("                                    <th     scope=\"col\">ID</th>\r\n");
      out.write("                                    <th  scope=\"col\">Nombre</th>\r\n");
      out.write("                                    <th  scope=\"col\">DNI</th>\r\n");
      out.write("                                    <th  scope=\"col\">Correo</th>\r\n");
      out.write("                                    <th  scope=\"col\">Telefono</th>\r\n");
      out.write("                                    <th  scope=\"col\">Accion</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    \r\n");
      out.write("                                ");

                                     
                                    IProfesorDAO profesorDAO = FactoryImpl.getInstance().getProfesorService();
                                    List<Profesor> profesorList=profesorDAO.obtenerProfesores();
                                        
                                     for(int i=0;i<profesorList.size();i++){
                                         
                                           Profesor prof=profesorList.get(i);
                                            
                                
      out.write("        \r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th scope=\"row\">");
      out.print( prof.getId() );
      out.write("</th>\r\n");
      out.write("                                            <td>");
      out.print( prof.getNombre() );
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( prof.getDni() );
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( prof.getEmail() );
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( prof.getTelefono() );
      out.write("</td>\r\n");
      out.write("                                            <td>\r\n");
      out.write("                                                <button class=\"btn btn-primary\">Ver</button>\r\n");
      out.write("                                                <button class=\"btn btn-warning\">Modificar</button>\r\n");
      out.write("                                                <button class=\"btn btn-danger\">Eliminar</button>\r\n");
      out.write("                                            </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                          </tr>\r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                    ");
        
                                            
                                        
                                        }
                                    
                                    
      out.write("\r\n");
      out.write("                                  \r\n");
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                              </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"modal fade\" id=\"modal-default\">\r\n");
      out.write("                        <div class=\"modal-dialog \">\r\n");
      out.write("                            <div class=\"modal-content \">\r\n");
      out.write("                                    <div class=\"modal-header \">\r\n");
      out.write("                                            <h5 class=\"modal-title\">Nuevo Profesor</h5>\r\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                                <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"modal-body\">\r\n");
      out.write("                                        <form action=\"profesores.jsp\" class=\"form-horizontal px-3\" id=\"frm-clases\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"id\" style=\"display:none;\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\r\n");
      out.write("                                                <label for=\"usuario\" class=\"col-sm-3 control-label\">Usuario</label>\r\n");
      out.write("                                                <div class=\"col-sm-8\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"usuario\" id=\"usuario\" placeholder=\"INGRESAR EL USUARIO\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\r\n");
      out.write("                                                <label for=\"password\" class=\"col-sm-3 control-label\">Password</label>\r\n");
      out.write("                                                <div class=\"col-sm-8\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"INGRESAR EL PASSWORD\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\r\n");
      out.write("                                                <label for=\"nombre\" class=\"col-sm-3 control-label\">Nombre</label>\r\n");
      out.write("                                                <div class=\"col-sm-8\">\r\n");
      out.write("                                                    <input type=\"text\" style=\"text-transform:uppercase;\"class=\"form-control\" name=\"nombre\" id=\"nombre\" placeholder=\"INGRESAR EL NOMBRE\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\r\n");
      out.write("                                                <label for=\"dni\" class=\"col-sm-3 control-label\">DNI</label>\r\n");
      out.write("                                                <div class=\"col-sm-8\">\r\n");
      out.write("                                                    <input type=\"text\" style=\"text-transform:uppercase;\"class=\"form-control\"  name=\"dni\" id=\"dni\" placeholder=\"INGRESAR EL DNI\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\r\n");
      out.write("                                                <label for=\"correo\" class=\"col-sm-3 control-label\">Correo</label>\r\n");
      out.write("                                                <div class=\"col-sm-8\">\r\n");
      out.write("                                                    <input type=\"text\" style=\"text-transform:uppercase;\"class=\"form-control\" name=\"correo\" id=\"correo\" placeholder=\"INGRESAR EL CORREO\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\r\n");
      out.write("                                                <label for=\"telefono\" class=\"col-sm-3 control-label\">Telefono</label>\r\n");
      out.write("                                                <div class=\"col-sm-8\">\r\n");
      out.write("                                                    <input type=\"text\" style=\"text-transform:uppercase;\"class=\"form-control\" name=\"telefono\" id=\"telefono\" placeholder=\"INGRESAR EL TELEFONO\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"modal-footer row justify-content-between\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-warning \" id=\"btn-cancelar\" data-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("\r\n");
      out.write("                                                <button type=\"submit\"  name=\"guardar\" class=\"btn btn-success\" id=\"btn-guardar\" >Guardar</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- /.modal-content -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    <!-- /.modal-dialog -->\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </main>\r\n");
      out.write("\r\n");
      out.write("                <footer class=\"footer-content col-12 text-light \">\r\n");
      out.write("                    <span>&copy;2020 WorkFast</span>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("         ");

            if(request.getParameter("guardar")!=null){

                    Profesor profesor=new Profesor();   
                    profesor.setNombre(request.getParameter("nombre"));
                    profesor.setEmail(request.getParameter("correo"));
                    profesor.setTelefono(request.getParameter("telefono"));
                    profesor.setDni(request.getParameter("dni"));

                    Usuario usuario=new Usuario();
                    usuario.setUser(request.getParameter("usuario"));
                    usuario.setPassword(request.getParameter("password"));
                    usuario.setRol("prof");

                    profesor.setUsuario(usuario);

                    profesorDAO.crearProfesor(profesor);

                    response.sendRedirect("profesores.jsp");
                
                
                
            }  
            
            
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/header.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
