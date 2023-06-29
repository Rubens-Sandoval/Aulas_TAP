<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - VEICULO</title>
    <body>
       <div class="container"/>
        <h1>INSERIR VEICULO</h1>
        <form name="inserirVeiculo" action="validaInserirVeiculo.jsp" method="post">
            Id do cliente: <input type="text" name="IDCLI" value=""> <br>
            Modelo: <input type="text" name="MODELO" value=""> <br>
            Placa: <input type="text" name="PLACA" value=""> <br>
            Defeito: <input type="text" name="DEFEITO" value=""> <br>
            <input type="submit" name="Enviar" value="Inserir">
        </form>
        </div>
    </body>
</html>