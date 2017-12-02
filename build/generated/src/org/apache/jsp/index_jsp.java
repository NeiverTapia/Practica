package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.com/libraries/bulma\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.1/css/bulma.min.css\">\n");
      out.write("<nav class=\"navbar\" role=\"navigation\" aria-label=\"main navigation\">\n");
      out.write("  <div class=\"navbar-brand\">\n");
      out.write("    <button class=\"button navbar-burger\">\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("    </button>\n");
      out.write("  </div>\n");
      out.write("</nav>\t\n");
      out.write("    <div class=\"container\">\n");
      out.write("            <div class=\"columns\"> \n");
      out.write("                <div class=\"column is-4\"> <h1 class=\"title\"> Listado de licores</h1> \n");
      out.write("                    \n");
      out.write("                 <table class=\"table\" border=\"2\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Codigo</th>\n");
      out.write("                    <th>Descripcion</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                   </tbody>\n");
      out.write("        </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column is-6\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                    <h1 class=\"title\"> Datos Licores </h1>\n");
      out.write("                    \n");
      out.write("                   <div class=\"label\">\n");
      out.write("                   <label class=\"label\">Codigo</label>\n");
      out.write("                    <div class=\"control\">\n");
      out.write("                  <label class=\"label\">dato</label>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                       <div class=\"label\">\n");
      out.write("                   <label class=\"label\">marca</label>\n");
      out.write("                    <div class=\"control\">\n");
      out.write("                  <label class=\"label\">dato</label>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                       <div class=\"label\">\n");
      out.write("                   <label class=\"label\">presentacion</label>\n");
      out.write("                    <div class=\"control\">\n");
      out.write("                  <label class=\"label\">dato</label>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                       <div class=\"label\">\n");
      out.write("                   <label class=\"label\">descripcion</label>\n");
      out.write("                    <div class=\"control\">\n");
      out.write("                  <label class=\"label\">dato</label>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                       <div class=\"label\">\n");
      out.write("                   <label class=\"label\">precio compra </label>\n");
      out.write("                    <div class=\"control\">\n");
      out.write("                  <label class=\"label\">dato</label>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                       <div class=\"label\">\n");
      out.write("                   <label class=\"label\"> precio venta</label>\n");
      out.write("                    <div class=\"control\">\n");
      out.write("                  <label class=\"label\">dato</label>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br><br>\n");
      out.write("                  <div class=\"field is-grouped\">\n");
      out.write("                   <div class=\"control\">\n");
      out.write("                   <button class=\"button is-link\" onClick=\"location.href = 'licores.jsp' \" >Nuevo</button>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"control\">\n");
      out.write("                    <button class=\"button is-link \">Editar</button>\n");
      out.write("                  </div>\n");
      out.write("                   <div class=\"control\">\n");
      out.write("                    <button class=\"button is-link \">Compra</button>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"control\">\n");
      out.write("                   <button class=\"button is-link \">Venta</button>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"control\">\n");
      out.write("                   <button class=\"button is-link \" >Eliminar</button>\n");
      out.write("                  </div>\n");
      out.write("                   </div>\n");
      out.write("                    \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("                \n");
      out.write("         \n");
      out.write("\n");
      out.write("     \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("dato");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                </tr>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
