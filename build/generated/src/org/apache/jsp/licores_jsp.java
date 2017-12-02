package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class licores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/conexion.jsp");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- en la directiva page observamos el import=\"java.sql.*\"-->\n");
      out.write("<!-- esta es la analogia en java a importar paquetes y/o clases-->\n");
      out.write("<!-- en el paquete java.sql.* estan las clases necesarias-->\n");
      out.write("<!-- para la conexion a la bd mysql -->\n");
      out.write("\n");

    /*conexion sera nuestra conexion a la bd*/
    Connection conexion=null;
    Statement sql= null;

    try{
        Class.forName("com.mysql.jdbc.Driver");
        conexion = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/local_licores","root","2468");
        sql= conexion.createStatement();
        //out.print("Conexion establecida");

    } catch (Exception ex){
        out.print("Error de conexion "+ex.toString());
    }


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--<h1>Hello World!</h1>-->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.com/libraries/bulma\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.1/css/bulma.min.css\">\n");
      out.write("    ");

    String codigo= request.getParameter("txtCodigo");
    String descripcion= request.getParameter("txtDescripcion");
    String marca= request.getParameter("txtMarca");
    String presentacion= request.getParameter("txtPresentacion");
    String precioVenta= request.getParameter("txtPrecio_Venta");
    String precioCompra= request.getParameter("txtprecio_Compra");
 
    
    
    String qry= "INSERT INTO local_licores.datos (Marca,Cantidad, Codigo, Descripcion, Precio_Compra, Precio_Venta, Presentacion) VALUES ('"+marca+"',"+0+","+ codigo +",'"+descripcion+"',"+precioCompra+","+precioVenta+",'"+presentacion+"')" ;
        try {
        
        sql.executeUpdate(qry);
        out.print("Licor Registrado");
        }catch (Exception e){
            out.print("Se presento este error "+e.toString());
        }
 
    
      out.write("\n");
      out.write("    \n");
      out.write("    <form name = \"frmlcores\" method= \"post\" action=\"licores.jsp\">\n");
      out.write("                  \n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\" column is-4\">\n");
      out.write("    <div class=\" container \">\n");
      out.write("        <h1 class=\"title\"> Crear Licores</h1>    \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"columns\">\n");
      out.write("        <div class=\"column is-4\">\n");
      out.write("        <div class=\"field\">\n");
      out.write("       <label class=\"label\">Codigo</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium\" name = \"txtCodigo\" type=\"text\" placeholder=\"codigo\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("         <div class=\"field\">\n");
      out.write("       <label class=\"label\">Marca</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium\" name = \"txtMarca\" type=\"text\" placeholder=\"Marca\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("       <label class=\"label\">Precio Venta</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium\" name = \"txtPrecio_Venta\" type=\"text\" placeholder=\"Codigo\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"column is-6\">\n");
      out.write("        <div class=\"field\">\n");
      out.write("       <label class=\"label\">Descripcion</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("      <input class=\"input is-medium\" name = \"txtDescripcion\"  type=\"text\" placeholder=\"Descripcion\" value=\"\">\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"field\">\n");
      out.write("       <label class=\"label\">Presentacion</label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium\" name = \"txtPresentacion\" type=\"text\" placeholder=\"Presentacion\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("         <div class=\"field\">\n");
      out.write("       <label class=\"label\">Precio Compra </label>\n");
      out.write("       <div class=\"control \">\n");
      out.write("       <input class=\"input is-medium\" name = \"txtprecio_Compra\" type=\"text\" placeholder=\"Precio Compra\" value=\"\">\n");
      out.write("       </div>\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"field is-grouped\">\n");
      out.write("                   <div class=\"control\">\n");
      out.write("                   <button class=\"button is-link\" type=\"submit\" value =\"ok\">Ok</button>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"control\">\n");
      out.write("                       \n");
      out.write("                       <button class=\"button is-link \">Cancelar</button>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("                            </form>\n");
      out.write("   \n");
      out.write("\n");
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
