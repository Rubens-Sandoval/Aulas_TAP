<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Mecanico"%>
<%@page import="projetomecanica.controller.ControllerMecanico"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Mecanico mec = new Mecanico(id);
    ControllerMecanico contmec = new ControllerMecanico();
    mec = contmec.buscar(mec);
    String pbusca = request.getParameter("PBUSCA");
    
%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - MECANICO</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR MECANICO</h1>
        <form name="alterarMecanico" action="validaAtualizarMecanico.jsp" method="post">
            Nome: <input type="text" name="NOME" value="<%=mec.getNome()%>"> <br>
            Cpf: <input type="text" name="CPF" value="<%=mec.getCpf()%>"> <br>
            Ctt: <input type="text" name="CTT" value="<%=mec.getCtt()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=mec.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>
