<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Conserto"%>
<%@page import="projetomecanica.controller.ControllerConserto"%>

<%
    int idcli = Integer.parseInt(request.getParameter("IDCLI"));
    int idmec = Integer.parseInt(request.getParameter("IDMEC"));
    int idv = Integer.parseInt(request.getParameter("IDV"));
    String dtentd = request.getParameter("DATAENTD");
    String dtentg = request.getParameter("DATAENTG");
 
    Conserto con = new Conserto(idcli,idmec,idv,dtentd, dtentg);
    ControllerConserto concont = new ControllerConserto();
    con = concont.inserir(con);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirConserto.jsp";
    response.sendRedirect(url);
%>
