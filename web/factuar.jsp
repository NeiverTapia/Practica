<%-- 
    Document   : factuar
    Created on : 30/11/2017, 10:17:12 PM
    Author     : user
--%>

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
    <div class="container">
        <div class="columns">
    <div class=" column is-3">
    <div class=" container ">
        <h1 class="title"> Venta Licores</h1>    
        <br>
        <br>
        <br>
        <div class="columns">
        <div class="column is-4">
        <div class="field">
       <label class="label">Codigo</label>
       <div class="control ">
       <input class="input is-medium  column is-6" type="text" placeholder="codigo" value="">
       </div>
       </div>
         <div class="field">
       <label class="label">marca</label>
       <div class="control ">
       <input class="input is-medium column is-6 " type="text" placeholder="marca" value="">
       </div>
       </div>
        <div class="field">
       <label class="label">precio Venta</label>
       <div class="control ">
       <input class="input is-medium column is-6 " type="text" placeholder="codigo" value="">
       </div>
       </div>
       </div>
       <div class="column is-6">
        <div class="field">
       <label class="label">Descripcion</label>
       <div class="control ">
      <input class="input is-medium" type="text" placeholder="Descripcion" value="">
      </div>
      </div>
       <div class="field">
       <label class="label">Presentacion</label>
       <div class="control ">
       <input class="input is-medium column is-6" type="text" placeholder="presentacion" value="">
       </div>
       </div>
         <div class="field">
       <label class="label">Cantidad </label>
       <div class="control ">
       <input class="input is-medium column is-4 " type="text" placeholder="codigo" value="">
       </div>
       </div>
      </div>
      </div>
      </div>
      </div>
     </div>
    <br>
       <div class="field">
       <label class="label">valor Venta </label>
       <div class="control ">
       <input class="input is-medium column is-2 " type="text" placeholder="codigo" value="">
       </div>
       </div>
    <br>  <br>
    <div class="field is-grouped">
     <div class="control">
    <button class="button is-link">Ok</button>
     </div>
    <div class="control">
    <button class="button is-link ">Cancelar</button>
    </div>
    </div>
    </div>
        
    </body>
</html>
