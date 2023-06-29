<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>CONSULTAR - MECANICO</title>
    <body>
       <div class="container"/>
            <h1>CONSULTAR MECANICO</h1>
            <form name="consultarMecanico" action="validaConsultarMecanico.jsp" method="post">
                NOME <input type="text" name ="NOME" value=""> <br>
                <input type="submit" name ="Enviar" value="Enviar"> <br>
            </form>
       </div>
    </body>
</html>
