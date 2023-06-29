<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - CONSERTO</title>
    <body>
       <div class="container"/>
        <h1>INSERIR CONSERTO</h1>
        <form name="inserirConserto" action="validaInserirConserto.jsp" method="post">
            Id do cliente: <input type="text" name="IDCLI" value=""> <br>
            Id do mecanico: <input type="text" name="IDMEC" value=""> <br>
            Id do veiculo: <input type="text" name="IDV" value=""> <br>
            Data de entrada: <input type="text" name="DATAENTD" value=""> <br>
            Data de entrega: <input type="text" name="DATAENTG" value=""> <br>
            <input type="submit" name="Enviar" value="Inserir">
        </form>
        </div>
    </body>
</html>
