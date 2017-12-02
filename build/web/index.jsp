<%-- 
    Document   : index
    Created on : 30/11/2017, 04:36:27 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<nav class="navbar" role="navigation" aria-label="main navigation">
  <div class="navbar-brand">
    <button class="button navbar-burger">
      <span></span>
      <span></span>
      <span></span>
    </button>
  </div>
</nav>	
    <div class="container">
            <div class="columns"> 
                <div class="column is-4"> <h1 class="title"> Listado de licores</h1> 
                    
                 <table class="table" border="2">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Descripcion</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dato" items= "${datos}">
                <tr>
                    <td>${dato.codigo}</td>
                    <td>${dato.descripcion}</td>
                </tr>
                </c:forEach>
                   </tbody>
        </table>
                </div>
                <div class="column is-6">
                    <div class="container">
                    <h1 class="title"> Datos Licores </h1>
                    
                   <div class="label">
                   <label class="label">Codigo</label>
                    <div class="control">
                  <label class="label">dato</label>
                   </div>
                   </div>
                       <div class="label">
                   <label class="label">marca</label>
                    <div class="control">
                  <label class="label">dato</label>
                   </div>
                   </div>
                       <div class="label">
                   <label class="label">presentacion</label>
                    <div class="control">
                  <label class="label">dato</label>
                   </div>
                   </div>
                       <div class="label">
                   <label class="label">descripcion</label>
                    <div class="control">
                  <label class="label">dato</label>
                   </div>
                   </div>
                       <div class="label">
                   <label class="label">precio compra </label>
                    <div class="control">
                  <label class="label">dato</label>
                   </div>
                   </div>
                       <div class="label">
                   <label class="label"> precio venta</label>
                    <div class="control">
                  <label class="label">dato</label>
                   </div>
                   </div>
                    </div>
                    <br><br>
                  <div class="field is-grouped">
                   <div class="control">
                   <button class="button is-link" onClick="location.href = 'licores.jsp' " >Nuevo</button>
                   </div>
                   <div class="control">
                    <button class="button is-link ">Editar</button>
                  </div>
                   <div class="control">
                    <button class="button is-link ">Compra</button>
                  </div>
                  <div class="control">
                   <button class="button is-link ">Venta</button>
                  </div>
                  <div class="control">
                   <button class="button is-link " >Eliminar</button>
                  </div>
                   </div>
                    
		</div>
	</div>
                
         

     
    </body>
</html>
