<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Veiculo"%>
<%@page import="projetomecanica.controller.ControllerVeiculo"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    int idcli = Integer.parseInt(request.getParameter("IDCLI"));
    String modelo = request.getParameter("MODELO");
    String placa = request.getParameter("PLACA");
    String defeito = request.getParameter("DEFEITO");
    String pbusca = request.getParameter("PBUSCA");
    Veiculo v = new Veiculo(id, idcli, modelo, placa, defeito);
    ControllerVeiculo contv = new ControllerVeiculo();
    contv.alterar(v);
    String url = "validaConsultarVeiculo.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>
