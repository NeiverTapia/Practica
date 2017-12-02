package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class factuar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.com/libraries/bulma\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.1/css/bulma.min.css\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"columns\">\n");
      out.write("    <div class=\" column is-3\">\n");
      out.write("    <div class=\" container \">\n");
      out.write("        <h1 class=\"title\"> Venta Licores</h1>    \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"columns\">\n");
      out.write("        <div class=\"column is-4\">\n");
      out.write("        <div class=\"field\">\n");
      out.write("       <label class=\"label\">Codigo</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium  column is-6\" type=\"text\" placeholder=\"codigo\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("         <div class=\"field\">\n");
      out.write("       <label class=\"label\">marca</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium column is-6 \" type=\"text\" placeholder=\"marca\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("       <label class=\"label\">precio Venta</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium column is-6 \" type=\"text\" placeholder=\"codigo\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"column is-6\">\n");
      out.write("        <div class=\"field\">\n");
      out.write("       <label class=\"label\">Descripcion</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("      <input class=\"input is-medium\" type=\"text\" placeholder=\"Descripcion\" value=\"\">\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"field\">\n");
      out.write("       <label class=\"label\">Presentacion</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium column is-6\" type=\"text\" placeholder=\"presentacion\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("         <div class=\"field\">\n");
      out.write("       <label class=\"label\">Cantidad </label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium column is-4 \" type=\"text\" placeholder=\"codigo\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("    <br>\n");
      out.write("       <div class=\"field\">\n");
      out.write("       <label class=\"label\">valor Venta </label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium column is-2 \" type=\"text\" placeholder=\"codigo\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("    <br>  <br>\n");
      out.write("    <div class=\"field is-grouped\">\n");
      out.write("     <div class=\"control\">\n");
      out.write("    <button class=\"button is-link\">Ok</button>\n");
      out.write("     </div>\n");
      out.write("    <div class=\"control\">\n");
      out.write("    <button class=\"button is-link \">Cancelar</button>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
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
