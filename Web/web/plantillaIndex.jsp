<%-- 
    Document   : plantillaIndex
    Created on : 21/03/2019, 05:18:59 PM
    Author     : josef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <title>Aplicación Web</title>
        <link href="Styles/Site.css" rel="stylesheet" type="text/css"/>
        <link href="Content/bootstrap.css" rel="stylesheet" type="text/css"/>
       <script src="Scripts/jquery-1.9.1.min.js" type="text/javascript"></script>
       <script src="Scripts/bootstrap.min.js" type="text/javascript"></script>
       
       
   </head>
    <body>
        <form id="Form1" >

            <div  class="container">
                        <div id="logo" >
                            <img id="Img1" src="Images/logo.png" alt="Freshdesign" />
                        </div>
             </div>
           <nav class="navbar navbar-default" role="navigation"  >
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>                    
                    </div>

                    <div class="navbar-header">
                           <a class="navbar-brand" href="index.jsp">Inicio</a>
                     </div>
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">                        
                            <li id="Li2" class="dropdown" >
                                <a href="" class="dropdown-toggle" data-toggle="dropdown"  id="A1">Reoportes<b class="caret"></b></a>
                                <ul id="Ul2" class="dropdown-menu" >
                                    <li> 
                                        <a href="ControllerCliente?accion=read" id="A2">Cliente</a>
                                    </li>
                                    <li>
                                        <a href="ControllerRenta?accion=read" id="A2">Renta</a>
                                    </li>
                                    <li>
                                        <a href="ControllerDetalleRenta?accion=read" id="A2">DetalleRenta</a>
                                    </li>
                                    <li>
                                        <a href="ControllerDevolucion?accion=read" id="A2">DetalleRenta</a>
                                    </li>
                                    
                                </ul>
                             </li>                         
                                           
                        </ul>                   
                    </div>
                </div>
            </nav>
            <div class="container body-content">
                <div style=" float:right;">                    
                </div>
                <footer>
                </footer>
            </div>  
       </form>   

    </body>
</html>

