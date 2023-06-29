<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Cliente"%>
<%@page import="projetomecanica.controller.ControllerCliente"%>
<%@page import="java.util.List"%>

<%
    String nome = request.getParameter("NOME");
    Cliente cli = new Cliente(nome);
    ControllerCliente clicont = new ControllerCliente();
    List<Cliente> clis = clicont.listar(cli);
    String url = "PBUSCA=" + nome + "&ID=";
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA CLIENTES</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="ID">Id</th>
                  <th data-field="NOME">Nome</th>
                  <th data-field="CPF">Cpf</th>
                  <th data-field="CTT">Ctt</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(clis.isEmpty())) { %>    
                <tbody>
                    <% for (Cliente listaClientes : clis) { %>
                        <tr>
                            <td><%=listaClientes.getId()%></td>
                            <td><%=listaClientes.getNome()%></td>
                            <td><%=listaClientes.getCpf()%></td>
                            <td><%=listaClientes.getCtt()%></td>
                            <td><a href="excluirCliente.jsp?<%=url + listaClientes.getId()%>">Excluir</a></td>
                            <td><a href="atualizarCliente.jsp?<%=url + listaClientes.getId()%>">Alterar</a></td>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>
