<%-- 
    Document   : licores
    Created on : 30/11/2017, 10:25:45 PM
    Author     : user
--%>
<%@include file="conexion.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <link rel="stylesheet" type="text/css" href="https://cdnjs.com/libraries/bulma">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.1/css/bulma.min.css">
    <%
    String codigo= request.getParameter("txtCodigo");
    String descripcion= request.getParameter("txtDescripcion");
    String marca= request.getParameter("txtMarca");
    String presentacion= request.getParameter("txtPresentacion");
    String precioVenta= request.getParameter("txtPrecio_Venta");
    String precioCompra= request.getParameter("txtprecio_Compra");
 
     if(codigo!=null && descripcion!=null && marca!=null && presentacion!=null && precioVenta!=null&& precioCompra!=null){
    
        String qry= "INSERT INTO local_licores.datos (Marca,Cantidad, Codigo, Descripcion, Precio_Compra, Precio_Venta, Presentacion) VALUES ('"+marca+"',"+0+","+ codigo +",'"+descripcion+"',"+precioCompra+","+precioVenta+",'"+presentacion+"')" ;
        sql.executeUpdate(qry);
        out.print("Licor Registrado");

     }else{
    %>
    
    <form name = "frmlcores" method= "post" action="licores.jsp">
                  
    <div class="container">
    <div class=" column is-4">
    <div class=" container ">
        <h1 class="title"> Crear Licores</h1>    
        <br>
        <br>
        <br>
        <div class="columns">
        <div class="column is-4">
        <div class="field">
       <label class="label">Codigo</label>
       <div class="control ">
       <input class="input is-medium" name = "txtCodigo" type="text" placeholder="codigo" value="">
       </div>
       </div>
         <div class="field">
       <label class="label">Marca</label>
       <div class="control ">
       <input class="input is-medium" name = "txtMarca" type="text" placeholder="Marca" value="">
       </div>
       </div>
        <div class="field">
       <label class="label">Precio Venta</label>
       <div class="control ">
       <input class="input is-medium" name = "txtPrecio_Venta" type="text" placeholder="Codigo" value="">
       </div>
       </div>
       </div>
       <div class="column is-6">
        <div class="field">
       <label class="label">Descripcion</label>
       <div class="control ">
      <input class="input is-medium" name = "txtDescripcion"  type="text" placeholder="Descripcion" value="">
      </div>
      </div>
       <div class="field">
       <label class="label">Presentacion</label>
       <div class="control ">
       <input class="input is-medium" name = "txtPresentacion" type="text" placeholder="Presentacion" value="">
       </div>
       </div>
         <div class="field">
       <label class="label">Precio Compra </label>
       <div class="control ">
       <input class="input is-medium" name = "txtprecio_Compra" type="text" placeholder="Precio Compra" value="">
       </div>
       </div>
      </div>
      </div>
      </div>
      </div>
    <br>
    <br>
    <div class="field is-grouped">
                   <div class="control">
                   <button class="button is-link" type="submit" value ="ok">Ok</button>
                   </div>
                   <div class="control">
                   <button class="button is-link " type="submit" onClick="location.href = 'index.jsp' " value ="cancelar">Cancelar</button>
                     </div>
                    </div>
                        </div>
                            </form>
    <%} %>

    </body>
</html>
