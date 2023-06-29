<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Veiculo"%>
<%@page import="projetomecanica.controller.ControllerVeiculo"%>


<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Veiculo v = new Veiculo(id);
    ControllerVeiculo vCont = new ControllerVeiculo();
    v = vCont.excluir(v);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarVeiculo.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>