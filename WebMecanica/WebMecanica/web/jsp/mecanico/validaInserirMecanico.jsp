<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Mecanico"%>
<%@page import="projetomecanica.controller.ControllerMecanico"%>

<%
    String nome = request.getParameter("NOME");
    String cpf = request.getParameter("CPF");
    String ctt = request.getParameter("EMAIL");
 
    Mecanico mec = new Mecanico(nome,cpf,ctt);
    ControllerMecanico meccont = new ControllerMecanico();
    mec = meccont.inserir(mec);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirMecanico.jsp";
    response.sendRedirect(url);
%>
