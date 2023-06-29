<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Conserto"%>
<%@page import="projetomecanica.controller.ControllerConserto"%>


<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Conserto con = new Conserto(id);
    ControllerConserto concont = new ControllerConserto();
    con = concont.excluir(con);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarConserto.jsp?CBUSCA=" + pbusca;
    response.sendRedirect(url);
%>