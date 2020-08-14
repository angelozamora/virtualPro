package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Utils.ConexionBD;
import Utils.Encriptar;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"icon\" href=\"img/escudosm.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.css\" >\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/signin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animation.css\">\n");
      out.write("\n");
      out.write("        <title>Sign In</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Connection con;
            Statement st=null;
            ResultSet rs=null;
            
            Encriptar enc=new Encriptar();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid  content\">\n");
      out.write("\n");
      out.write("                <div class=\"row content-row\">\n");
      out.write("                    <div class=\"col-lg-7  index fadeInOut\">\n");
      out.write("                        <div class=\"row  index-content \">\n");
      out.write("                            <div class=\"col-12 text-light pl-5 py-2 index-titulo fadeInDown\">\n");
      out.write("                                <h1 class=\"titulo2\">Pedro Zulen</h1>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\" col-12 col-lg-5  content-sub\">\n");
      out.write("                    \n");
      out.write("                        <div class=\"row  py-4 justify-content-center\">\n");
      out.write("                            <div class=\"col-10  col-sm-8 col-md-6 col-lg-8 login-content fadeInOpacity\" > \n");
      out.write("                                <div class=\"col-12 logo-content\">\n");
      out.write("                                    <div class=\"form-logo \">\n");
      out.write("                                        <img src=\"img/unmsm.jpg\" alt=\"\" class=\"logo-img\">\n");
      out.write("                                        <h1 class=\"logo-titulo text-white\">Sign In</h1>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <form action=\"#\" id=\"\" class=\" col-12  text-white px-4\">\n");
      out.write("                                    <div class=\"form-group \">\n");
      out.write("                                        <label for=\"usuario\">USUARIO</label>\n");
      out.write("                                        <input type=\"text\" id=\"usuario\" name=\"usuario\" class=\"form-input\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"password\">PASSWORD</label>\n");
      out.write("                                        <input type=\"text\" id=\"password\" name=\"password\" class=\"form-input\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group row justify-content-center mt-4\">\n");
      out.write("                                        \n");
      out.write("                                            <button type=\"submit\" class=\" btn btn-success mx-auto\" name=\"login\">INGRESAR</button>\n");
      out.write("\n");
      out.write("                                        <div class=\"row col-12 mt-3 text-center\">\n");
      out.write("                                            <span class=\"col-12 col-md-6  col-lg-12 my-2\">\n");
      out.write("                                                <a href=\"#\">Registrarme</a>\n");
      out.write("                                            </span>\n");
      out.write("                                            <span class=\"col-12 col-md-6  col-lg-12 my-2\">\n");
      out.write("                                                <a href=\"#\">¿Olvidaste tu Contraseña?</a>\n");
      out.write("                                            </span>\n");
      out.write("                                            <span class=\"col-12 col-lg-12 my-2\">\n");
      out.write("                                                <a href=\"index.jsp\">Cancelar</a>\n");
      out.write("                                            </span>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                \n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <footer class=\"footer-content col-12 text-light \">\n");
      out.write("                        <span>&copy;2020 UNMSM</span>\n");
      out.write("                    </footer>  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            
            
            if(request.getParameter("login")!=null){
                
                ConexionBD.getInstance().setRol("root");
                con=ConexionBD.getInstance().getConnection();

                
                String user=request.getParameter("usuario");
                String password = request.getParameter("password");
                String rol=null;
                //enc.getMD5(password)
                try{
                    st=con.createStatement();
                    rs=st.executeQuery("CALL SP_validarusuario('"+user+"','"+password+"');");
                    while(rs.next()){     
                        rol=rs.getString("rol");

                        //RequestDispatcher view = request.getRequestDispatcher("index.jsp");  
                        //view.forward(request, response);
                    }
                    
                    
                    if(rol!=null){
                        System.out.println("El rol para validar es : "+rol);
                        if(rol.equals("user") || rol.equals("alumn")){
                            
                            rs=st.executeQuery("CALL SP_validarAlumno('"+user+"','"+password+"');");
                            
                            while(rs.next()){ 
                                
                                System.out.println("se logeo User");
                                session.setAttribute("logueado", "1");
                                session.setAttribute("user", rs.getString("user")); 
                                session.setAttribute("rol", rs.getString("rol"));
                                session.setAttribute("id", rs.getInt("idAlumno"));
                                
                            }
                            
                        }
                        else{
                            if(rol.equals("admin")){
                            
                                rs=st.executeQuery("CALL SP_validarAdministrador('"+user+"','"+password+"');");

                                while(rs.next()){ 

                                    System.out.println("se logeo Admin");
                                    session.setAttribute("logueado", "1");
                                    session.setAttribute("user", rs.getString("user")); 
                                    session.setAttribute("rol", rs.getString("rol"));
                                    session.setAttribute("id", rs.getInt("idAdministrador"));


                                }
                            }
                        }
                        
                            String url="login.jsp?user="+session.getAttribute("user")+"&&rol="+session.getAttribute("rol");
                            ConexionBD.getInstance().setRol(""+session.getAttribute("rol"));
                       
                            response.sendRedirect(url);
                        
                        
                    }
                    
                    out.print("<div class='alert alert-danger' role='alert'>usuario no valido</div>");
                }
                catch(Exception e){
                       e.getMessage();
                       e.printStackTrace();
                }
            }
 
        
            
         
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
