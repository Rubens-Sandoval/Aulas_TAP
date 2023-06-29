<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - CLIENTE</title>
    <body>
       <div class="container"/>
        <h1>INSERIR CLIENTE</h1>
        <form name="inserirPessoa" action="validaInserirCliente.jsp" method="post">
            Nome: <input type="text" name="NOME" value=""> <br>
            Cpf: <input type="text" name="CPF" value=""> <br>
            Contato <input type="text" name="EMAIL" value=""> <br>
            <input type="submit" name="Enviar" value="Inserir">
        </form>
        </div>
    </body>
</html>
