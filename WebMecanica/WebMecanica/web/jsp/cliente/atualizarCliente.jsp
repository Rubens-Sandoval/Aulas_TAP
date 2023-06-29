<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Cliente"%>
<%@page import="projetomecanica.controller.ControllerCliente"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Cliente cli = new Cliente(id);
    ControllerCliente contcli = new ControllerCliente();
    cli = contcli.buscar(cli);
    String pbusca = request.getParameter("PBUSCA");
%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - CLIENTE</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR CLIENTE</h1>
        <form name="atualizarCliente" action="validaAtualizarCliente.jsp" method="post">
            Nome: <input type="text" name="NOME" value="<%=cli.getNome()%>"> <br>
            Cpf: <input type="text" name="CPF" value="<%=cli.getCpf()%>"> <br>
            Ctt: <input type="text" name="CTT" value="<%=cli.getCtt()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=cli.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>
