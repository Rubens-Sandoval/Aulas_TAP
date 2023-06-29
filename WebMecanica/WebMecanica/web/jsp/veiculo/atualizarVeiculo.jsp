<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Veiculo"%>
<%@page import="projetomecanica.controller.ControllerVeiculo"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Veiculo v = new Veiculo(id);
    ControllerVeiculo contv = new ControllerVeiculo();
    v = contv.buscar(v);
    String pbusca = request.getParameter("PBUSCA");
    
%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - VEICULO</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR VEICULO</h1>
        <form name="alterarVeiculo" action="validaAtualizarVeiculo.jsp" method="post">
            Id Cliente: <input type="text" name="IDCLI" value="<%=v.getId_cliente()%>"> <br>
            Modelo: <input type="text" name="MODELO" value="<%=v.getModelo()%>"> <br>
            Placa: <input type="text" name="PLACA" value="<%=v.getPlaca()%>"> <br>
            Defeito: <input type="text" name="DEFEITO" value="<%=v.getDefeito()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=v.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>
