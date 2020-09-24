package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.IGradoDAO;
import Bean.Seccion;
import java.util.ArrayList;
import DAO.IAdministradorDAO;
import Bean.Alumno;
import java.util.List;
import DAO.IAlumnoDAO;
import Bean.Grado;
import FactoryImpl.FactoryImpl;

public final class seccion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"icon\" href=\"img/escudosm.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.css\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estandar.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Seccion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            int idGradoSeccion = Integer.parseInt(request.getParameter("idgs")+"");
            String nivel = request.getParameter("nivel");
     
        
      out.write("\n");
      out.write("        <div class=\"container-fluid content \">\n");
      out.write("        <div class=\"row \">\n");
      out.write("            <header class=\"col-12  bg-dark row justify-content-between mx-0 header-content\">\n");
      out.write("                \n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <main class=\"container  main-content \"> \n");
      out.write("                \n");
      out.write("                                       \n");
      out.write("                        <div class=\"box py-3 px-3  mt-3 result-content bg-white \">\n");
      out.write("                            \n");
      out.write("                            <div class=\"box-header row justify-content-between px-3 \" id=\"box-header-prestamos\">\n");
      out.write("                               ");

                                        
            
                                    IGradoDAO gradoDAO=FactoryImpl.getInstance().getGradoService();
                                    IAdministradorDAO administradorDAO=FactoryImpl.getInstance().getAdministradorService();
                                    Grado grado=gradoDAO.obtenerGradoySeccion(idGradoSeccion);
                                
      out.write("\n");
      out.write("                                <div class=\" col-8\">\n");
      out.write("                                    <h5 class=\"mt-3\">");
      out.print(grado.getNombreGrado() );
      out.write(" -SECCION ");
      out.print(grado.getSeccionesList().get(0).getNombreSeccion() );
      out.write(":</h5>\n");
      out.write("                                    <span>Lista de Alumnos de la Seccion</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 col-lg-2\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-warning\" style=\"font-weight: 400;color: white;\"  id=\"btn-nuevo\" data-toggle=\"modal\" data-target=\"#modal-default\">MATRICULAR</button>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"box-body  table-responsive  mt-1 py-3 px-3  \"\n");
      out.write("                            id=\"box-header-prestamos\">\n");
      out.write("                                     \n");
      out.write("                                <table class=\"table table-striped table-bordered \" id=\"tbl-seccion\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                                    <thead  class=\"thead-dark\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th  class=\"text-center\">ID</th>\n");
      out.write("                                            <th  class=\"text-center\">NOMBRE</th>\n");
      out.write("                                            <th  class=\"text-center\">DNI</th>\n");
      out.write("                                            <th  class=\"text-center\">CORREO</th>\n");
      out.write("                                            <th  class=\"text-center\">ACCION</th>\n");
      out.write("        \n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\" class=\"text-center\">1</th>\n");
      out.write("                                            <td class=\"text-center\">MORALES, BECK F.</td>\n");
      out.write("                                            <td class=\"text-center\">71854956</td>\n");
      out.write("                                            <td class=\"text-center\">ARTES@GMAIL.COM</td>\n");
      out.write("                                                    \n");
      out.write("                                            <td class=\"text-center\">\n");
      out.write("                                                <button class=\"btn btn-primary\"> <i class=\"far fa-eye\"></i> </button>\n");
      out.write("                                                <button class=\"btn btn-warning\"> <i class=\"far fa-edit\"></i> </button>\n");
      out.write("                                                <button class=\"btn btn-danger\"> <i class=\"far fa-trash-alt\"></i> </button>\n");
      out.write("                                            </td>\n");
      out.write("                    \n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <!-- Modal para la Matricula -->\n");
      out.write("                <div class=\"modal fade\" id=\"modal-default\">\n");
      out.write("                    <div class=\"modal-dialog \">\n");
      out.write("                        <div class=\"modal-content \">\n");
      out.write("                                <div class=\"modal-header \">\n");
      out.write("                                        <h5 class=\"modal-title\">Nueva Matricula</h5>\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                        </button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-body\">\n");
      out.write("                                    <form class=\"form-horizontal px-3\" id=\"frm-clases\">\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group row justify-content-around\">\n");
      out.write("                                            <label for=\"alumno\" class=\"col-sm-3 control-label\">Alumno</label>\n");
      out.write("                                            <div class=\"col-sm-8\">\n");
      out.write("                                                \n");
      out.write("                                                <select name=\"alumno\" id=\"alumno\" class=\"form-control\">\n");
      out.write("                                                    <option value=\"\" disabled selected>SELECCIONAR</option>\n");
      out.write("                                                    <option value=\"BIOLOGIA\">BIOLOGIA</option>\n");
      out.write("                                                    <option value=\"CIENCIAS\">CIENCIAS</option>\n");
      out.write("                                                    <option value=\"FISICA\">FISICA</option>\n");
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"modal-footer row justify-content-between\">\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-warning \" id=\"btn-cancelar\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                            \n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-success\" name=\"guardar\" id=\"btn-guardar\" >Guardar</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.modal-content -->\n");
      out.write("                    </div>\n");
      out.write("                <!-- /.modal-dialog -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </main>\n");
      out.write("\n");
      out.write("            <footer class=\"footer-content col-12 text-light \">\n");
      out.write("                <span>&copy;2020 WorkFast</span>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("           \n");
      out.write("                                           ");
         
                                              /*     
  
                                                //IAlumnoDAO alumnoDAO= FactoryImpl.getInstance().getAlumnoService();
                                                //List<Alumno> alumnoList = alumnoDAO.obtenerAlumnosxGradoxSeccion(idGradoSeccion);
                                                
                                                for(int i=0;i<alumnoList.size();i++){
                                                    Alumno alu=alumnoList.get(i);
                                                  */  
                                            
      out.write("\n");
      out.write("                                            \n");
      out.write("                                                    \n");
      out.write("        ");

             /*                                               List<Alumno> alumnoList1=alumnoDAO.obtenerAlumnosxNivel(nivel);
                                                            for(int i=0;i<alumnoList1.size();i++){
                                                                Alumno alu2=alumnoList1.get(i);
                                                          */      
                                                        
      out.write("\n");
      out.write("\n");
      out.write("                                                        \n");
      out.write("        \n");
      out.write("        ");

            if(request.getParameter("guardar")!=null){
                System.out.println("INGRESO A MATRICULAR");
                
                Alumno alu=new Alumno();
                alu.setId(Integer.parseInt(request.getParameter("alumno")));
                System.out.println("IEl id es : "+alu.getId());
                
                List<Alumno> alumnoList2=new ArrayList<Alumno>();
                alumnoList2.add(alu);
                 
                Seccion seccion=new Seccion();
                seccion.setAlumnos(alumnoList2);
                
                //administradorDAO.matricularAlumnos(idGradoSeccion+"", seccion);

                alu.matriculado();
                //alumnoDAO.cambiarEstadoAlumno(alu);
                
                //String url="seccion.jsp?idgs="+idGradoSeccion+"&nivel=PRIMARIA";


            }
                                        
                                        
        
      out.write("  \n");
      out.write("        \n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/table.js\"></script>\n");
      out.write("        <script src=\"js/header.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.21/js/dataTables.bootstrap4.min.js\"></script>\n");
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
