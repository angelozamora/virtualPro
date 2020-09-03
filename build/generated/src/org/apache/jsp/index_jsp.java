package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"icon\" href=\"img/icon.png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap/bootstrap.css\" >\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    \r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container-fluid content\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <header class=\"col-12  bg-dark row justify-content-between mx-0 header-content\">\r\n");
      out.write("\r\n");
      out.write("                </header>\r\n");
      out.write("\r\n");
      out.write("                <main class=\"col-12 main-content \">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12 home-portada fadeInOut\">\r\n");
      out.write("                            <div class=\"row content justify-content-center align-content-center\">\r\n");
      out.write("                                <div class=\"col-5 px-2 text-white port-content fadeInOut bg-danger py-2\">\r\n");
      out.write("                                    <h1 class=\"text-center titulo1\">VIRTUAL PRO</h1>\r\n");
      out.write("                                    <h6 class=\"text-center\">EL PODER DEL CONOCIMIENTO AL ALCANCE DE TU MANO</h6>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-12 bg-white mt-4 py-3\">\r\n");
      out.write("                            <h5 class=\"text-center mt-3 text-primary\">Que necesitas?</h5>\r\n");
      out.write("                            <h1 class=\"col-12 text-center mt-1\">Contamos con un servicio de calidad !</h1>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row justify-content-center px-3 mt-5\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-9 mb-3   py-3\">\r\n");
      out.write("                                    <div class=\"row justify-content-center  px-3\">\r\n");
      out.write("                                        <div class=\"col-12 col-md-5  text-center \">\r\n");
      out.write("                                            <div class=\"row justify-content-center\">\r\n");
      out.write("                                                <div class=\"col-10  atributo-img-content px-0\">\r\n");
      out.write("                                                    <img src=\"img/atributo1.jpg\" alt=\"\" class=\"atributo-img\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-12 col-md-7  py-2 \">\r\n");
      out.write("                                            <h3 class=\"text-center\">RECURSOS DIGITALES</h3>\r\n");
      out.write("                                            <p class=\"mt-3\">\r\n");
      out.write("                                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus, amet labore. Est recusandae eos fugit incidunt consectetur perspiciatis dolores explicabo exercitationem dicta nostrum officia, voluptatem reprehenderit rerum possimus quod illo.\r\n");
      out.write("                                            </p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-9 mb-3   py-3\">\r\n");
      out.write("                                    <div class=\"row justify-content-center  px-3\">\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-12 col-md-7  py-2 \">\r\n");
      out.write("                                            <h3 class=\"text-center\">AREAS COMUNITARIAS</h3>\r\n");
      out.write("                                            <p class=\"mt-3\">\r\n");
      out.write("                                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus, amet labore. Est recusandae eos fugit incidunt consectetur perspiciatis dolores explicabo exercitationem dicta nostrum officia, voluptatem reprehenderit rerum possimus quod illo.\r\n");
      out.write("                                            </p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-12 col-md-5  text-center \">\r\n");
      out.write("                                            <div class=\"row justify-content-center\">\r\n");
      out.write("                                                <div class=\"col-10  atributo-img-content px-0\">\r\n");
      out.write("                                                    <img src=\"img/atributo2.jpg\" alt=\"\" class=\"atributo-img\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-9 mb-3   py-3\">\r\n");
      out.write("                                    <div class=\"row justify-content-center  px-3\">\r\n");
      out.write("                                        <div class=\"col-12 col-md-5  text-center \">\r\n");
      out.write("                                            <div class=\"row justify-content-center\">\r\n");
      out.write("                                                <div class=\"col-10  atributo-img-content px-0\">\r\n");
      out.write("                                                    <img src=\"img/atributo3.jpg\" alt=\"\" class=\"atributo-img\" style=\"width: 100%; height: 100%;\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-12 col-md-7  py-2 \">\r\n");
      out.write("                                            <h3 class=\"text-center\">ATENCION PERSONAL</h3>\r\n");
      out.write("                                            <p class=\"mt-3\">\r\n");
      out.write("                                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus, amet labore. Est recusandae eos fugit incidunt consectetur perspiciatis dolores explicabo exercitationem dicta nostrum officia, voluptatem reprehenderit rerum possimus quod illo.\r\n");
      out.write("                                            </p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-12  mt-4  py-4 \">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row  mt-3 service-content py-2 justify-content-center \">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-10 col-md-9 px-0 prom-depa text-center \">\r\n");
      out.write("                                    <h3 >Tú puedes formar un gran futuro<span class=\"mx-3\"><i class=\"fas fa-angle-right\"></i></span> </h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-12 col-md-3 my-3 mx-5 py-3 px-5 service\">\r\n");
      out.write("                                   <h4 class=\"text-center\">Servicios</h4>\r\n");
      out.write("                                   <p>\r\n");
      out.write("                                       Lorem ipsum dolor sit, amet consectetur adipisicing elit. Odit beatae corporis ullam sequi! Aspernatur quo est tempora quas, magni atque.\r\n");
      out.write("                                   </p>\r\n");
      out.write("                                   <div class=\"row justify-content-center\">\r\n");
      out.write("                                    <button class=\"btn btn-danger col-6\">Ver Servicios</button>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\" col-12 col-md-3 my-3 mx-5 py-3 px-5 service\">\r\n");
      out.write("                                    <h4 class=\"text-center\">Recursos</h4>\r\n");
      out.write("                                   <p>\r\n");
      out.write("                                    Lorem ipsum dolor sit, amet consectetur adipisicing elit. Odit beatae corporis ullam sequi! Aspernatur quo est tempora quas, magni atque.\r\n");
      out.write("                                   </p>\r\n");
      out.write("                                   <div class=\"row justify-content-center\">\r\n");
      out.write("                                    <button class=\"btn btn-danger col-6\">Mis Recursos</button>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-12 col-md-3 my-3 mx-5 py-3 px-5 service\">\r\n");
      out.write("                                    <h4 class=\"text-center\">Carnets</h4>\r\n");
      out.write("                                   <p>\r\n");
      out.write("                                    Lorem ipsum dolor sit, amet consectetur adipisicing elit. Odit beatae corporis ullam sequi! Aspernatur quo est tempora quas, magni atque.\r\n");
      out.write("                                   </p>\r\n");
      out.write("                                   <div class=\"row justify-content-center\">\r\n");
      out.write("                                    <button class=\"btn btn-danger col-6\">Ver Carnets</button>\r\n");
      out.write("                                   </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </main>\r\n");
      out.write("\r\n");
      out.write("                <footer class=\"footer-content col-12 text-light \">\r\n");
      out.write("                    <span>&copy;2020 UNMSM</span>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/header.js\"></script>\r\n");
      out.write("        \r\n");
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
