<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Cliente"%>
<%@page import="projetomecanica.controller.ControllerCliente"%>

<%
    String nome = request.getParameter("NOME");
    String cpf = request.getParameter("CPF");
    String ctt = request.getParameter("EMAIL");
 
    Cliente cli = new Cliente(nome,cpf,ctt);
    ControllerCliente clicont = new ControllerCliente();
    cli = clicont.inserir(cli);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirCliente.jsp";
    response.sendRedirect(url);
%>
