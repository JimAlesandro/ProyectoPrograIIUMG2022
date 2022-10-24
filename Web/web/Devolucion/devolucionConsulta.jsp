<%-- 
    Document   : devolucionConsulta
    Created on : 23/10/2022, 02:05:43 PM
    Author     : Christian
--%>

<%@page import="java.util.Iterator"%>
<%@page import="org.models.ModelDevolucion"%>
<%@page import="org.models.ModelDevolucion"%>
<%@page import="java.util.List"%>
<%@page import="org.dao.DaoDevolucion"%>
<jsp:include page="../plantillaIndex.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Devolucion</title>
    </head>
    <body>
        <div class="container">            
            <h1>reporte Devolucion</h1>
            
                <table border="1" width="1" cellspacing="1" class="table table-bordered">
                    <thead>
                        <tr>
                            <th class="text-center">Id devolucion </th>
                            <th class="text-center">id renta</th>
                            <th class="text-center">serie</th>
                            <th class="text-center">fecha</th>
                            <th class="text-center">observaciones</th>
                            <th class="text-center">id usuario</th>
                            <th class="text-center">dias atraso</th>
                            <th class="text-center">mora</th>
                        </tr>
                    </thead>
                    <%
                        DaoDevolucion daoDevolucion= new DaoDevolucion();
                        List<ModelDevolucion> lstDevolucion = daoDevolucion.listar();
                        Iterator<ModelDevolucion> iteratorDevolucion = lstDevolucion.iterator();
                        ModelDevolucion devolucion = null;
                        while (iteratorDevolucion.hasNext()){
                            devolucion = iteratorDevolucion.next();                        
                    %>                     
                    <tbody>
                        <tr>
                            <td class="text-center"><%= devolucion.getIdDevolucion()%></td>
                            <td class="text-center"><%= devolucion.getIdRenta()%></td>
                            <td class="text-center"><%= devolucion.getSerie()%></td>
                            <td class="text-center"><%= devolucion.getFecha()%></td>
                            <td class="text-center"><%= devolucion.getObservaciones()%></td>
                            <td class="text-center"><%= devolucion.getIdUsuario()%></td>
                            <td class="text-center"><%= devolucion.getDiasAtraso()%></td>
                            <td class="text-center"><%= devolucion.getMora()%></td>
                                                            
                                
                            </td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
                   

            
        </div>
        
    </body>
</html>
