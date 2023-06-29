<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Conserto"%>
<%@page import="projetomecanica.controller.ControllerConserto"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    int idcli = Integer.parseInt(request.getParameter("IDCLI"));
    int idmec = Integer.parseInt(request.getParameter("IDMEC"));
    int idv = Integer.parseInt(request.getParameter("IDV"));
    String dtentd = request.getParameter("DTENTD");
    String dtentg = request.getParameter("DTENTG");
    String pbusca = request.getParameter("PBUSCA");
    Conserto con = new Conserto(id, idcli, idmec, idv, dtentd, dtentg);
    ControllerConserto concont = new ControllerConserto();
    con = concont.alterar(con);
    String url = "validaConsultarConserto.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>
