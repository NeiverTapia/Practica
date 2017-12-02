<%-- 
    Document   : conexion
    Created on : 1/12/2017, 12:01:40 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- en la directiva page observamos el import="java.sql.*"-->
<!-- esta es la analogia en java a importar paquetes y/o clases-->
<!-- en el paquete java.sql.* estan las clases necesarias-->
<!-- para la conexion a la bd mysql -->
<%@ page language="java" import="java.sql.*" %>
<%
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

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->

    </body>
</html>
