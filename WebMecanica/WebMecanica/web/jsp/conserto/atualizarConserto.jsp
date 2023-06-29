<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Conserto"%>
<%@page import="projetomecanica.controller.ControllerConserto"%>

<%
    String dtentd = request.getParameter("ID");
    Conserto con = new Conserto(dtentd);
    ControllerConserto concont = new ControllerConserto();
    con = concont.buscar(con);
    String pbusca = request.getParameter("PBUSCA");
    
%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - CONSERTO</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR CONSERTO</h1>
        <form name="alterarConserto" action="validaAtualizarConserto.jsp" method="post">
            Id cliente: <input type="text" name="IDCLI" value="<%=con.getId_cliente()%>"> <br>
            Id mecanico: <input type="text" name="IDMEC" value="<%=con.getId_mecanico()%>"> <br>
            Id veiculo: <input type="text" name="IDV" value="<%=con.getId_veiculo()%>"> <br>
            Data entrada: <input type="text" name="DTENTD" value="<%=con.getData_entrada()%>"> <br>
            Data entrega: <input type="text" name="DTENTG" value="<%=con.getData_entrega()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=con.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>
