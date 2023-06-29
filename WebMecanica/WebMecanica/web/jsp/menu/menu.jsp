<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>SISTEMA </title>
    <body>
        <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown1'>Manter Cliente</a>        
        <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown2'>Manter Mecanico</a>        
        <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown3'>Manter Veiculo</a>        
        <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown4'>Manter Conserto</a>    
        
        <!-- Dropdown1 Structure -->
        <ul id='dropdown1' class='dropdown-content'>
            <li><a href="../cliente/inserirCliente.jsp"> Inserir cliente </a></li>
            <li><a href="../cliente/consultarCliente.jsp"> Consultar cliente </a></li>
        </ul>
        
        <!-- Dropdown2 Structure -->
        <ul id='dropdown2' class='dropdown-content'>
            <li><a href="../mecanico/inserirMecanico.jsp"> Inserir mecanico </a></li>
            <li><a href="../mecanico/consultarMecanico.jsp"> Consultar mecanico </a></li>
        </ul>
        
        <!-- Dropdown3 Structure -->
        <ul id='dropdown3' class='dropdown-content'>
            <li><a href="../veiculo/inserirVeiculo.jsp"> Inserir veiculo </a></li>
            <li><a href="../veiculo/consultarVeiculo.jsp"> Consultar veiculo </a></li>
        </ul>
        
        
        <!-- Dropdown4 Structure -->
        <ul id='dropdown4' class='dropdown-content'>
            <li><a href="../conserto/inserirConserto.jsp"> Inserir conserto </a></li>
            <li><a href="../conserto/consultarConserto.jsp"> Consultar conserto </a></li>
        </ul>
    </body>
</html>
