<%-- 
    Document   : detalleRentaConsulta
    Created on : 23/10/2022, 12:58:16 PM
    Author     : Christian
--%>

<%@page import="org.dao.DaoDetalleRenta"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.models.ModelDetalleRenta"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../plantillaIndex.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>consulta detalle renta</title>
    </head>
    <body>
        <div class="container">            
            <h1>reporte detalle Renta</h1>
            
                <table border="1" width="1" cellspacing="1" class="table table-bordered">
                    <thead>
                        <tr>
                            <th class="text-center">Id renta</th>
                            <th class="text-center">Serie</th>
                            <th class="text-center">id detalle renta</th>
                            <th class="text-center">Id vehiculo </th>
                            <th class="text-center">precio alquiler</th>                           
                        </tr>
                    </thead>
                    <%
                        DaoDetalleRenta daoDetalleRenta= new DaoDetalleRenta();
                        List<ModelDetalleRenta> lstDetalleRenta = daoDetalleRenta.listar();
                        Iterator<ModelDetalleRenta> iteratorDetalleRenta = lstDetalleRenta.iterator();
                        ModelDetalleRenta detalleRenta = null;
                        while (iteratorDetalleRenta.hasNext()){
                            detalleRenta = iteratorDetalleRenta.next();                        
                    %>                     
                    <tbody>
                        <tr>
                            <td class="text-center"><%= detalleRenta.getIdRenta()%></td>
                            <td class="text-center"><%= detalleRenta.getSerie()%></td>
                            <td class="text-center"><%= detalleRenta.getIdDetalleRenta()%></td>
                            <td class="text-center"><%= detalleRenta.getIdVehiculo()%></td>
                            <td class="text-center"><%= detalleRenta.getPrecioAlquiler()%></td>
                            
                                                            
                                
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
                   

            
        </div>
        
    </body>
</html>
