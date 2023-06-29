<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Veiculo"%>
<%@page import="projetomecanica.controller.ControllerVeiculo"%>

<%
    int idcli = Integer.parseInt(request.getParameter("IDCLI"));
    String modelo = request.getParameter("MODELO");
    String placa = request.getParameter("PLACA");
    String defeito = request.getParameter("DEFEITO");
 
    Veiculo v = new Veiculo(idcli,modelo,placa,defeito);
    ControllerVeiculo vcont = new ControllerVeiculo();
    v = vcont.inserir(v);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirVeiculo.jsp";
    response.sendRedirect(url);
%>
