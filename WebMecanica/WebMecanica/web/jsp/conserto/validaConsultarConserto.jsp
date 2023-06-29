<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Conserto"%>
<%@page import="projetomecanica.controller.ControllerConserto"%>
<%@page import="java.util.List"%>

<%
    String dtentd = request.getParameter("DTENTD");
    Conserto con = new Conserto(dtentd);
    ControllerConserto concont = new ControllerConserto();
    List<Conserto> cons = concont.listar(con);
    String url = "CBUSCA=" + dtentd + "&ID=";
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA CONSERTOS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="ID">Id</th>
                  <th data-field="IDCLI">Id Cliente</th>
                  <th data-field="NOMECLI">Nome do cliente</th>
                  <th data-field="IDMEC">Id Mecanico</th>
                  <th data-field="NOMEMEC">Nome do mecânico</th>
                  <th data-field="IDV">Id Veiculo</th>
                  <th data-field="PLACAV">placa do veiculo</th>
                  <th data-field="DTENTD">Data Entrada</th>
                  <th data-field="DTENTG">Data Entrega</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(cons.isEmpty())) { %>    
                <tbody>
                    <% for (Conserto listaConsertos : cons) { %>
                        <tr>
                            <td><%=listaConsertos.getId()%></td>
                            <td><%=listaConsertos.getId_cliente()%></td>
                            <td><%=listaConsertos.getCli().getNome()%></td>
                            <td><%=listaConsertos.getId_mecanico()%></td>
                            <td><%=listaConsertos.getMec().getNome()%></td>
                            <td><%=listaConsertos.getId_veiculo()%></td>
                            <td><%=listaConsertos.getV().getPlaca()%></td>
                            <td><%=listaConsertos.getData_entrada()%></td>
                            <td><%=listaConsertos.getData_entrega()%></td>
                            <td><a href="excluirConserto.jsp?<%=url + listaConsertos.getId()%>">Excluir</a></td>
                            <td><a href="atualizarConserto.jsp?<%=url + listaConsertos.getData_entrada()%>">Alterar</a></td>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>
