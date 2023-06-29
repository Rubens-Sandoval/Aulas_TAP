<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Cliente"%>
<%@page import="projetomecanica.controller.ControllerCliente"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    String nome = request.getParameter("NOME");
    String cpf = request.getParameter("CPF");
    String ctt = request.getParameter("CTT");
    String pbusca = request.getParameter("PBUSCA");
    Cliente cli = new Cliente(id,nome, cpf, ctt);
    ControllerCliente contcli = new ControllerCliente();
    cli = contcli.alterar(cli);
    String url = "validaConsultarCliente.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>
