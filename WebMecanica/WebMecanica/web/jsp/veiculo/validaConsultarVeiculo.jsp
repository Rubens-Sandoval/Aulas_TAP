<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Veiculo"%>
<%@page import="projetomecanica.controller.ControllerVeiculo"%>
<%@page import="java.util.List"%>

<%
    String placa = request.getParameter("PLACA");
    Veiculo v = new Veiculo(placa);
    ControllerVeiculo meccont = new ControllerVeiculo();
    List<Veiculo> vs = meccont.listar(v);
    String url = "CBUSCA=" + placa + "&ID=";
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA VEICULOS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="IDCLI">Id Cliente</th>
                  <th data-field="MODELO">Modelo</th>
                  <th data-field="PLACA">Placa</th>
                  <th data-field="DEFEITO">Defeito</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(vs.isEmpty())) { %>    
                <tbody>
                    <% for (Veiculo listaClientes : vs) { %>
                        <tr>
                            <td><%=listaClientes.getId()%></td>
                            <td><%=listaClientes.getId_cliente()%></td>
                            <td><%=listaClientes.getModelo()%></td>
                            <td><%=listaClientes.getPlaca()%></td>
                            <td><%=listaClientes.getDefeito()%></td>
                            <td><a href="excluirVeiculo.jsp?<%=url + listaClientes.getId()%>">Excluir</a></td>
                            <td><a href="atualizarVeiculo.jsp?<%=url + listaClientes.getId()%>">Alterar</a></td>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>
