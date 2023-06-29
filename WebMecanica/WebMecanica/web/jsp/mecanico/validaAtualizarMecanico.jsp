<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Mecanico"%>
<%@page import="projetomecanica.controller.ControllerMecanico"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    String nome = request.getParameter("NOME");
    String cpf = request.getParameter("CPF");
    String ctt = request.getParameter("CTT");
    String pbusca = request.getParameter("PBUSCA");
    Mecanico mec = new Mecanico(id, nome, cpf, ctt);
    ControllerMecanico contmec = new ControllerMecanico();
    mec = contmec.alterar(mec);
    String url = "validaConsultarMecanico.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>
