package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.Curso;
import DAO.ICursoDAO;
import Bean.Seccion;
import DAO.ISeccionDAO;
import Bean.Grado;
import java.util.List;
import FactoryImpl.FactoryImpl;
import DAO.IGradoDAO;

public final class primaria_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/primaria.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Primaria</title>\n");
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
      out.write("                <main class=\"container  main-content \"> \n");
      out.write("                    <div class=\"row py-3 px-3\">\n");
      out.write("                        <div class=\"col-12  py-4 px-5 result-content bg-white\">\n");
      out.write("                            <div class=\"row justify-content-between px-2\">\n");
      out.write("                                <div class=\" col-8\">\n");
      out.write("                                    <h5 class=\"mt-3\">PRIMARIA :</h5>\n");
      out.write("                                    <span>Lista de Grados de Primaria</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\" col-2\">\n");
      out.write("                                    <button class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#modal-default\">NUEVO GRADO</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 bg-white mt-2 py-4 px-2 result-content mb-5 \" id=\"listaRecursos\">\n");
      out.write("\n");
      out.write("                            <ul>\n");
      out.write("                                ");

                                    IGradoDAO gradoDAO=FactoryImpl.getInstance().getGradoService();
                                    ISeccionDAO seccionDAO = FactoryImpl.getInstance().getSeccionService();
                                    List<Grado> gradoList=gradoDAO.obtenerGradosxNivel("PRIMARIA");
                                    
                                        for(int i=0;i<gradoList.size();i++){
                                            Grado grado=gradoList.get(i);
                                
                                
      out.write("\n");
      out.write("                                <li class=\"mt-2\">\n");
      out.write("                                    <span class=\"grado\">\n");
      out.write("                                        <i class=\"fas fa-graduation-cap mr-2 grado-icon\"></i>");
      out.print(grado.getNombreGrado() );
      out.write("<i class=\"fas fa-angle-down ml-2 grado-icon\"></i>\n");
      out.write("                                    </span>\n");
      out.write("\n");
      out.write("                                    <ul class=\"seccion desactivo\">\n");
      out.write("                                        \n");
      out.write("                                        ");

                                        
                                            grado.setSeccionesList(seccionDAO.obtenerSeccionesxGrado(grado.getId()));
                                            
                                            for(int j=0;j<grado.getSeccionesList().size();j++){
                                                Seccion seccion=grado.getSeccionesList().get(j);
                                            
                                        
                                        
      out.write("\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"seccion.jsp?idgs=");
      out.print(seccion.getId() );
      out.write("&nivel=PRIMARIA\"  class=\"seccion\">\n");
      out.write("                                                <i class=\"fas fa-layer-group mr-1\"></i>SECCION  ");
      out.print(seccion.getNombreSeccion() );
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        \n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <li >\n");
      out.write("                                            <a class=\"seccion seccion-plus\" href=\"\" data-id=\"");
      out.print(grado.getId() );
      out.write("\" data-toggle=\"modal\" data-target=\"#modal-seccion-default\">\n");
      out.write("                                                <i class=\"fas fa-plus-circle mr-1\"></i>Nueva Seccion ...\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal fade\" id=\"modal-default\">\n");
      out.write("                        <div class=\"modal-dialog \">\n");
      out.write("                            <div class=\"modal-content \">\n");
      out.write("                                    <div class=\"modal-header \">\n");
      out.write("                                            <h5 class=\"modal-title\">Nuevo Grado</h5>\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                            </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <form action=\"\" method=\"POST\" class=\"form-horizontal px-3\" id=\"frm-clases\">\n");
      out.write("                                            \n");
      out.write("\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"grado\" class=\"col-sm-3 control-label\">Grado</label>\n");
      out.write("                                                <div class=\"col-sm-8\">    \n");
      out.write("                                                    <select name=\"\" id=\"\" class=\"form-control\">\n");
      out.write("                                                        <option value=\"\" disabled selected>SELECCIONAR</option>\n");
      out.write("                                                        ");

                                                           List<Grado> gradoList2=gradoDAO.obtenerGradosxNivel("PRIMARIA");
                                                           for(int i=0;i<gradoList2.size();i++){
                                                               Grado grado2=gradoList2.get(i);
                                                        
      out.write("\n");
      out.write("                                                        <option value=\"");
      out.print(grado2.getId() );
      out.write('"');
      out.write('>');
      out.print(grado2.getNombreGrado() );
      out.write("</option>\n");
      out.write("                                                        \n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                                    \n");
      out.write("                                            ");

                                                ICursoDAO cursoDAO=FactoryImpl.getInstance().getCursoService();
                                                List<Curso> cursoLisrt=cursoDAO.obtenerCursos();
                                            
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"curso1\" class=\"col-sm-3 control-label\">Curso 1</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <select name=\"curso1\" id=\"\" class=\"form-control\">\n");
      out.write("                                                        <option value=\"\" disabled selected>SELECCIONAR</option>\n");
      out.write("                                                        ");

                                                            for(int i=0;i<cursoLisrt.size();i++){
                                                                Curso curso=cursoLisrt.get(i);
                                                        
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                        <option value=\"");
      out.print(curso.getId() );
      out.write('"');
      out.write('>');
      out.print(curso.getNombreCurso() );
      out.write("</option>\n");
      out.write("                                                      \n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"curso2\" class=\"col-sm-3 control-label\">Curso 2</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <select name=\"curso2\" id=\"\" class=\"form-control\">\n");
      out.write("                                                        <option value=\"\" disabled selected>SELECCIONAR</option>\n");
      out.write("                                                        ");

                                                            for(int i=0;i<cursoLisrt.size();i++){
                                                                Curso curso=cursoLisrt.get(i);
                                                        
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                        <option value=\"");
      out.print(curso.getId() );
      out.write('"');
      out.write('>');
      out.print(curso.getNombreCurso() );
      out.write("</option>\n");
      out.write("                                                      \n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"curso3\" class=\"col-sm-3 control-label\">Curso 3</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <select name=\"curso3\" id=\"\" class=\"form-control\">\n");
      out.write("                                                        <option value=\"\" disabled selected>SELECCIONAR</option>\n");
      out.write("                                                        ");

                                                            for(int i=0;i<cursoLisrt.size();i++){
                                                                Curso curso=cursoLisrt.get(i);
                                                        
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                        <option value=\"");
      out.print(curso.getId() );
      out.write('"');
      out.write('>');
      out.print(curso.getNombreCurso() );
      out.write("</option>\n");
      out.write("                                                      \n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"curso4\" class=\"col-sm-3 control-label\">Curso 4</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <select name=\"curso4\" id=\"\" class=\"form-control\">\n");
      out.write("                                                        <option value=\"\" disabled selected>SELECCIONAR</option>\n");
      out.write("                                                        ");

                                                            for(int i=0;i<cursoLisrt.size();i++){
                                                                Curso curso=cursoLisrt.get(i);
                                                        
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                        <option value=\"");
      out.print(curso.getId() );
      out.write('"');
      out.write('>');
      out.print(curso.getNombreCurso() );
      out.write("</option>\n");
      out.write("                                                      \n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"modal-footer row justify-content-between\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-warning \" id=\"btn-cancelar\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-success\" name=\"guardar-grado\" id=\"btn-guardar-grado\" >Guardar</button>\n");
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
      out.write("                    <!-- Modal para la Seccion -->\n");
      out.write("                    <div class=\"modal fade\" id=\"modal-seccion-default\">\n");
      out.write("                        <div class=\"modal-dialog \">\n");
      out.write("                            <div class=\"modal-content \">\n");
      out.write("                                    <div class=\"modal-header \">\n");
      out.write("                                            <h5 class=\"modal-title\">Nueva Seccion</h5>\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                            </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <form  action=\"\"  class=\"form-horizontal px-3\" id=\"frm-clases\">\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"grado-Id\" class=\"col-sm-3 control-label\">Grado Id</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"grado-Id\" id=\"grado-Id\" readonly  required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row justify-content-around\">\n");
      out.write("                                                <label for=\"seccion-add\" class=\"col-sm-3 control-label\">Seccion</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <select name=\"seccion-add\" id=\"seccion-add\" class=\"form-control\" required=\"\">\n");
      out.write("                                                        <option value=\"\" disabled selected>SELECCIONAR</option>\n");
      out.write("                                                        ");

                                                            List<Seccion> seccionList1=seccionDAO.obtenerSecciones();
                                                            for(int i=0;i<seccionList1.size();i++){
                                                                Seccion seccion1=seccionList1.get(i);
                                                            
                                                        
      out.write("\n");
      out.write("                                       \n");
      out.write("                                                        <option value=\"");
      out.print(seccion1.getId() );
      out.write('"');
      out.write('>');
      out.print(seccion1.getNombreSeccion() );
      out.write("</option>\n");
      out.write("                                                      \n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"modal-footer row justify-content-between\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-warning \" id=\"btn-cancelar\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-success\" name=\"guardar\" id=\"btn-guardar\" >Guardar</button>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </main>\n");
      out.write("\n");
      out.write("                <footer class=\"footer-content col-12 text-light \">\n");
      out.write("                    <span>&copy;2020 WorkFast</span>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("        ");

            if(request.getParameter("guardar")!=null){
                
                
                int idGrado=Integer.parseInt(request.getParameter("grado-Id")+"");
                int idSeccion=Integer.parseInt(request.getParameter("seccion-add")+"");

                    
                gradoDAO.agregarSeccionaGrado(idGrado, idSeccion);
                gradoDAO.obtenerGrados();
           
                
                
            }  
            
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            if(request.getParameter("guardar-grado")!=null){
                
                
                response.sendRedirect("index.jsp");
           
                
                
            }  
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/header.js\"></script>\n");
      out.write("        <script src=\"js/primaria.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
