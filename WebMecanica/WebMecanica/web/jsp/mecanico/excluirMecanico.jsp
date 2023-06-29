<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Mecanico"%>
<%@page import="projetomecanica.controller.ControllerMecanico"%>


<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Mecanico mec = new Mecanico(id);
    ControllerMecanico mecCont = new ControllerMecanico();
    mec = mecCont.excluir(mec);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarMecanico.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>