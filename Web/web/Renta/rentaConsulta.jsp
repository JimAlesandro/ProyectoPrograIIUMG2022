<%-- 
    Document   : rentaConsulta
    Created on : 22/10/2022, 12:42:12 PM
    Author     : Christian
--%>

<%@page import="java.util.Iterator"%>
<%@page import="org.models.ModelRenta"%>
<%@page import="java.util.List"%>
<%@page import="org.dao.DaoRenta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../plantillaIndex.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Renta</title>
    </head>
    <body>
        <div class="container">            
            <h1>reporte Renta</h1>
            
                <table border="1" width="1" cellspacing="1" class="table table-bordered">
                    <thead>
                        <tr>
                            <th class="text-center">Id renta</th>
                            <th class="text-center">Serie</th>
                            <th class="text-center">Id cliente</th>
                            <th class="text-center">Id usuario</th>
                            <th class="text-center">id tipo pago</th>
                            <th class="text-center">fecha prestamo</th>
                            <th class="text-center">fecha devolucion</th>
                            <th class="text-center">total</th>
                        </tr>
                    </thead>
                    <%
                        DaoRenta daoRenta= new DaoRenta();
                        List<ModelRenta> lstRenta = daoRenta.listar();
                        Iterator<ModelRenta> iteratorRenta = lstRenta.iterator();
                        ModelRenta renta = null;
                        while (iteratorRenta.hasNext()){
                            renta = iteratorRenta.next();                        
                    %>                     
                    <tbody>
                        <tr>
                            <td class="text-center"><%= renta.getIdRenta()%></td>
                            <td class="text-center"><%= renta.getSerie()%></td>
                            <td class="text-center"><%= renta.getIdCliente()%></td>
                            <td class="text-center"><%= renta.getIdUsuario()%></td>
                            <td class="text-center"><%= renta.getIdTipoPago()%></td>
                            <td class="text-center"><%= renta.getFechaPrestamo()%></td>
                            <td class="text-center"><%= renta.getFechaDevolucion()%></td>
                            <td class="text-center"><%= renta.getTotal()%></td>
                                                            
                                
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
                   

            
        </div>
        
    </body>
</html>
