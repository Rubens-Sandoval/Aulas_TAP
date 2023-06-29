<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>CONSULTAR - CONSERTO</title>
    <body>
       <div class="container"/>
            <h1>CONSULTAR CONSERTO</h1>
            <form name="consultarConserto" action="validaConsultarConserto.jsp" method="post">
                Data entrada: <input type="text" name ="DTENTD" value=""> <br>
                <input type="submit" name ="Enviar" value="Enviar"> <br>
            </form>
       </div>
    </body>
</html>
