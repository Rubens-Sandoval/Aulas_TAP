<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="projetomecanica.bean.Mecanico"%>
<%@page import="projetomecanica.controller.ControllerMecanico"%>
<%@page import="java.util.List"%>

<%
    String nome = request.getParameter("NOME");
    Mecanico mec = new Mecanico(nome);
    ControllerMecanico meccont = new ControllerMecanico();
    List<Mecanico> mecs = meccont.listar(mec);
    String url = "CBUSCA=" + nome + "&ID=";
%>

<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA MECANICOS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Cpf">Cpf</th>
                  <th data-field="Ctt">Ctt</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(mecs.isEmpty())) { %>    
                <tbody>
                    <% for (Mecanico listaClientes : mecs) { %>
                        <tr>
                            <td><%=listaClientes.getId()%></td>
                            <td><%=listaClientes.getNome()%></td>
                            <td><%=listaClientes.getCpf()%></td>
                            <td><%=listaClientes.getCtt()%></td>
                            <td><a href="excluirMecanico.jsp?<%=url + listaClientes.getId()%>">Excluir</a></td>
                            <td><a href="atualizarMecanico.jsp?<%=url + listaClientes.getId()%>">Alterar</a></td>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>
