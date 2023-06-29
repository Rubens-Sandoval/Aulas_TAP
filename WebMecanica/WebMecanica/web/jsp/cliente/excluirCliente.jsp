<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Cliente"%>
<%@page import="projetomecanica.controller.ControllerCliente"%>


<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Cliente cli = new Cliente(id);
    ControllerCliente cliCont = new ControllerCliente();
    cli = cliCont.excluir(cli);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarCliente.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>